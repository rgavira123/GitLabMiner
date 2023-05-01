package aiss.gitlabminer.service;


import aiss.gitlabminer.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import aiss.gitlabminer.util.GitLabUtils;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class GitLabService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${gitlabminer.token}")
    private String token;

    public ResponseEntity<Project> getProjectById(String id){
        String uri = "https://gitlab.com/api/v4/projects/"+id;

        return restTemplate.exchange(uri, HttpMethod.GET, null, Project.class);
    }

    public ResponseEntity<Commit[]> getAllCommits(String id) {
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/repository/commits/";

        return getResponseEntity(uri,Commit[].class);
    }

    public List<Commit> groupAllCommits(String id, Integer since, Integer maxPages) {
        List<Commit> commits = new ArrayList<>();
        Integer defaultPages;
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/repository/commits/";

        if (since != null) {
            uri += "?since=" + LocalDateTime.now().minusDays(since);
        } else {
            uri += "?since=" + LocalDateTime.now().minusDays(2);
        }

        ResponseEntity<Commit[]> response = getResponseEntity(uri, Commit[].class);
        List<Commit> pageCommits = Arrays.stream(response.getBody()).toList();
        commits.addAll(pageCommits);

        //2..n pages
        String nextPageURL = GitLabUtils.getNextPageUrl(response.getHeaders());

        if(maxPages!=null){
            defaultPages=maxPages;
        }
        else{
            defaultPages=2;
        }

        int page = 2;
        while (nextPageURL != null && page <= defaultPages) {
            response = getResponseEntity(nextPageURL,Commit[].class);
            pageCommits = Arrays.stream(response.getBody()).toList();
            commits.addAll(pageCommits);

            nextPageURL = GitLabUtils.getNextPageUrl(response.getHeaders());
            page++;

        }
        return commits;

    }

    public ResponseEntity<Issue[]> getAllIssues(String id){
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues";

        return getResponseEntity(uri,Issue[].class);
    }

    public List<Issue> groupAllIssues(String id, Integer updated_after, Integer maxPages) {
        List<Issue> issues = new ArrayList<>();
        Integer defaultPages;
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues";

        if (updated_after != null) {
            uri += "/?updated_after=" + LocalDateTime.now().minusDays(updated_after);
        } else {
            uri += "/?updated_after=" + LocalDateTime.now().minusDays(20);
        }

        ResponseEntity<Issue[]> response = getResponseEntity(uri,Issue[].class);
        List<Issue> pageIssues = Arrays.stream(response.getBody()).toList();
        issues.addAll(pageIssues);

        //2..n pages
        String nextPageURL = GitLabUtils.getNextPageUrl(response.getHeaders());

        if(maxPages!=null){
            defaultPages=maxPages;
        }
        else{
            defaultPages=2;
        }

        int page = 2;
        while (nextPageURL != null && page <= defaultPages) {
            response = getResponseEntity(nextPageURL,Issue[].class);
            pageIssues = Arrays.stream(response.getBody()).toList();
            issues.addAll(pageIssues);
            nextPageURL = GitLabUtils.getNextPageUrl(response.getHeaders());
            page++;
        }
        return issues;
    }

    public ResponseEntity<Comment[]> getIssueComments(String id, String issue_iid){

        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues/" + issue_iid + "/notes";

        return getResponseEntity(uri,Comment[].class);
    }

    public List<Comment> groupIssueComments(String id, String issue_iid, Integer maxPages){
        List<Comment> comments = new ArrayList<>();
        Integer defaultPages;
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues/" + issue_iid + "/notes";

        ResponseEntity<Comment[]> response = getResponseEntity(uri, Comment[].class);
        List<Comment> pageComments = Arrays.stream(response.getBody()).toList();
        comments.addAll(pageComments);

        //2..n pages
        String nextPageURL = GitLabUtils.getNextPageUrl(response.getHeaders());

        if(maxPages!=null){
            defaultPages=maxPages;
        }
        else{
            defaultPages=2;
        }

        int page = 2;
        while(nextPageURL != null && page <= defaultPages){
            response = getResponseEntity(nextPageURL,Comment[].class);
            pageComments = Arrays.stream(response.getBody()).toList();
            comments.addAll(pageComments);

            nextPageURL = GitLabUtils.getNextPageUrl(response.getHeaders());
            page++;
        }

        return comments;
    }

    private <T1> ResponseEntity<T1[]> getResponseEntity(String uri, Class<T1[]> clase) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("PRIVATE-TOKEN", token);

        HttpEntity<T1[]> request = new HttpEntity<>(null,headers);

        return restTemplate.exchange(uri,
                HttpMethod.GET,
                request,
                clase);
    }

}
