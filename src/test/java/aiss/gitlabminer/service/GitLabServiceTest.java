package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Comment;
import aiss.gitlabminer.model.Commit;
import aiss.gitlabminer.model.Issue;
import aiss.gitlabminer.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GitLabServiceTest {

    @Autowired
    GitLabService gitLabService;

    @Test
    void getProjectById() {
        ResponseEntity<Project> project = gitLabService.getProjectById("4207231");
        assertTrue(project.getBody() != null, "the project is empty");
        System.out.println(project.getBody());
    }

    @Test
    void getAllCommits() {
        ResponseEntity<Commit[]> commits = gitLabService.getAllCommits("4207231");
        assertTrue(commits.getBody() != null, "no commits have been found");
        System.out.println(Arrays.stream(commits.getBody()).toList());
    }

    @Test
    void getAllIssues() {
        ResponseEntity<Issue[]> issues = gitLabService.getAllIssues("4207231");
        assertTrue(issues.getBody() != null, "no issues have been found");
        System.out.println(Arrays.stream(issues.getBody()).toList());
    }

    //funcion modificada, para que devuelva ya una lista, ya tenemos el metodo que lo hace, el que se llama group.
    @Test
    void getIssueComments() {
        ResponseEntity<Comment[]> comments = gitLabService.getIssueComments("4207231", "1234");
        assertTrue(comments.getBody() != null, "no comments were found");
        System.out.println(Arrays.stream(comments.getBody()).toList());
    }

    @Test
    void groupAllCommits() {
        List<Commit> place = gitLabService.groupAllCommits("4207231", null, 2);
        assertTrue(place.size() != 0, "the list of commits is empty");
        System.out.println(place);
    }

    @Test
    void groupAllIssues() {
        List<Issue> place = gitLabService.groupAllIssues("4207231", 30, 1);
        assertTrue(place.size() != 0, "the list of issues is empty");
        System.out.println(place);
    }

    @Test
    void groupIssueComments() {
        List<Comment> place = gitLabService.groupIssueComments("4207231", "1234", 2);
        assertTrue(place.size() != 0, "the list of comments is empty");
        System.out.println(place);
    }

    // funcionGetgitLabMiner(String id, Integer since, Integer updated_after, Integer maxPages){ Project proyecto = getProjectById(id).getBody()
    // ProjectGitMiner proyectoRefactor = formateaProyecto(proyecto)}

}