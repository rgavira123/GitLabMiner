package aiss.gitlabminer.gitlabmodel;

import java.util.List;

public class GitLabMinerProject {

    public String id;
    public String name;
    public String web_url;
    private List<GitLabMinerCommit> commits;
    private List<GitLabMinerIssue> issues;

    public GitLabMinerProject(String id, String name, String webUrl, List<GitLabMinerCommit> commits, List<GitLabMinerIssue> issues) {
        this.id = id;
        this.name = name;
        this.web_url = webUrl;
        this.commits = commits;
        this.issues = issues;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public List<GitLabMinerCommit> getCommits() {
        return commits;
    }

    public void setCommits(List<GitLabMinerCommit> commits) {
        this.commits = commits;
    }

    public List<GitLabMinerIssue> getIssues() {
        return issues;
    }

    public void setIssues(List<GitLabMinerIssue> issues) {
        this.issues = issues;
    }

}
