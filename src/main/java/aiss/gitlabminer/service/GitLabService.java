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

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class GitLabService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${gitlabminer.token}")
    private String token;

    public ResponseEntity<Project> getProjectById(String id){
        String uri = "https://gitlab.com/api/v4/projects/"+id;

        ResponseEntity<Project> response = restTemplate.exchange(uri, HttpMethod.GET, null, Project.class);
        return response;
    }

    public ResponseEntity<Commit[]> getAllCommits(String id, Integer since) {
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/repository/commits/";

        if (since != null) {
            uri += "?since=" + LocalDateTime.now().minusDays(since);
        } else {
            uri += "?since=" + LocalDateTime.now().minusDays(2);
        }

        ResponseEntity<Commit[]> response = restTemplate.exchange(uri, HttpMethod.GET, null, Commit[].class);
        return response;
    }

    public ResponseEntity<Issue[]> getAllIssues(String id, Integer updated_after){
        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues";

        if (updated_after != null) {
            uri += "?updated_after=" + LocalDateTime.now().minusDays(updated_after);
        } else {
            uri += "?updated_after=" + LocalDateTime.now().minusDays(20);
        }

        ResponseEntity<Issue[]> response = restTemplate.exchange(uri, HttpMethod.GET, null, Issue[].class);
        return response;
    }

    public ResponseEntity<Comment[]> getIssueComments(String id, String issue_iid){
        HttpHeaders headers = new HttpHeaders();
        headers.set("PRIVATE-TOKEN", token);
        HttpEntity<Comment[]> request = new HttpEntity<>(null,headers);

        String uri = "https://gitlab.com/api/v4/projects/" + id + "/issues/" + issue_iid + "/notes";

        ResponseEntity<Comment[]> response = restTemplate.exchange(uri, HttpMethod.GET, request, Comment[].class);
        return response;
    }
}
