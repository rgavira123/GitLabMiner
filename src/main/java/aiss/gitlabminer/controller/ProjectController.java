package aiss.gitlabminer.controller;

import aiss.gitlabminer.gitlabmodel.*;
import aiss.gitlabminer.model.Comment;
import aiss.gitlabminer.model.Commit;
import aiss.gitlabminer.model.Issue;
import aiss.gitlabminer.model.Project;
import aiss.gitlabminer.service.GitLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Content;

import java.util.List;
import java.util.Optional;

@Tag(name="GitLab Project", description="GitLab project miner API")
@RestController
@RequestMapping("/gitlab")
public class ProjectController{

    @Autowired
    GitLabService gitLabService;

    @Autowired
    RestTemplate restTemplate;

    // GET http://localhost:8081/gitlab/{id}[?since=5&updatedAfter=30&maxPages=3]
    @Operation(
            summary = "Get project by id",
            description = "Get project by id",
            tags = {"project", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Success", content = {@Content(schema = @Schema(implementation = GitLabMinerProject.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {@Content(schema = @Schema())})
    })
    @GetMapping("/{id}")
    public GitLabMinerProject findOneProject(@Parameter(description = "id of the project to be searched") @PathVariable String id,
                                             @RequestParam(required = false) Integer since,
                                             @RequestParam(required = false, name = "updated_after") Integer updatedAfter,
                                             @RequestParam(required = false, name = "max_pages") Integer maxPages) {

        Project project = gitLabService.getProjectById(id).getBody();
        String projectId = project.getId().toString();
        String projectName = project.getName();
        String project_webUrl = project.getWebUrl();
        List<GitLabMinerCommit> commits = gitLabService.groupAllCommits(id,since,maxPages).stream().map(x->formateaCommit(x)).toList();
        List<GitLabMinerIssue> issues = gitLabService.groupAllIssues(id, updatedAfter, maxPages).stream().map(x->formateaIssue(x,id,maxPages)).toList();

        GitLabMinerProject newProject = new GitLabMinerProject(projectId, projectName, project_webUrl, commits, issues);

        return newProject;
    }

    private GitLabMinerCommit formateaCommit(Commit commit){
        return new GitLabMinerCommit(commit.getId(),commit.getTitle(),commit.getMessage(),
                commit.getAuthorName(),commit.getAuthorEmail(),commit.getAuthoredDate(),
                commit.getCommitterName(),commit.getCommitterEmail(),commit.getCommittedDate(),commit.getWebUrl());

    }

    private GitLabMinerIssue formateaIssue(Issue issue, String id, Integer maxPages){
        String issueId = issue.getId().toString();
        String ref_id = issue.getIid().toString();
        String title = issue.getTitle();
        String description = issue.getDescription();
        String state = issue.getState();
        String created_at = issue.getCreatedAt();
        String updated_at = issue.getUpdatedAt();
        String closed_at = issue.getClosedAt();
        List<String> labels = issue.getLabels();
        GitLabMinerUser author = new GitLabMinerUser(issue.getAuthor().getId().toString(), issue.getAuthor().getUsername(),issue.getAuthor().getName(),issue.getAuthor().getAvatarUrl(),issue.getAuthor().getWebUrl());

        GitLabMinerUser assignee = issue.getAssignee()==null?null:new GitLabMinerUser(issue.getAssignee().getId().toString(), issue.getAssignee().getUsername(), issue.getAssignee().getName(), issue.getAssignee().getAvatarUrl(), issue.getAssignee().getWebUrl());
        //GitLabMinerUser assignee = null;
        Integer upvotes = issue.getUpvotes();
        Integer downvotes = issue.getDownvotes();
        String web_url = issue.getWebUrl();
        List<GitLabMinerComment> comments= gitLabService.groupIssueComments(id,issue.getIid().toString(),maxPages).stream().map(x->formateaComment(x)).toList();


        return new GitLabMinerIssue(issueId, ref_id, title, description, state, created_at, updated_at, closed_at, labels,
                author,assignee,upvotes,downvotes,web_url,comments);
    }

    private GitLabMinerComment formateaComment(Comment comment){
        String id = comment.getId().toString();
        String body = comment.getBody();
        GitLabMinerUser author = new GitLabMinerUser(comment.getAuthor().getId().toString(), comment.getAuthor().getUsername(),comment.getAuthor().getName(),comment.getAuthor().getAvatarUrl(),comment.getAuthor().getWebUrl());
        String created_at = comment.getCreatedAt();
        String updated_at = comment.getUpdatedAt();
        return new GitLabMinerComment(id, body, author, created_at, updated_at);
    }

    @Operation(
            summary = "Insert a project",
            description = "Add a project whose data is built from the GitLab API",
            tags = {"project", "post"})
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Created", content = {@Content(schema = @Schema(implementation = GitLabMinerProject.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema())})
    })
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public GitLabMinerProject SendProject(@Parameter(description = "id of the project to be created") @PathVariable String id,
                                       @RequestParam(required = false) Integer since,
                                       @RequestParam(required = false, name = "updated_after") Integer updatedAfter,
                                       @RequestParam(required = false, name = "max_pages") Integer maxPages){

        Project project = gitLabService.getProjectById(id).getBody();
        String projectId = project.getId().toString();
        String projectName = project.getName();
        String project_webUrl = project.getWebUrl();
        List<GitLabMinerCommit> commits = gitLabService.groupAllCommits(id,since,maxPages).stream().map(x->formateaCommit(x)).toList();
        List<GitLabMinerIssue> issues = gitLabService.groupAllIssues(id, updatedAfter, maxPages).stream().map(x->formateaIssue(x,id,maxPages)).toList();

        GitLabMinerProject proyectoFormateado = new GitLabMinerProject(projectId,projectName,project_webUrl,commits,issues);


       GitLabMinerProject sentProject = restTemplate.postForObject("http://localhost:8080/gitminer/projects", proyectoFormateado,GitLabMinerProject.class);

       return sentProject;

    }

}
