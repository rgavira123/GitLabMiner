
package aiss.gitlabminer.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "iid",
    "project_id",
    "title",
    "description",
    "state",
    "created_at",
    "updated_at",
    "closed_at",
    "closed_by",
    "labels",
    "milestone",
    "assignees",
    "author",
    "type",
    "assignee",
    "user_notes_count",
    "merge_requests_count",
    "upvotes",
    "downvotes",
    "due_date",
    "confidential",
    "discussion_locked",
    "issue_type",
    "web_url",
    "time_stats",
    "task_completion_status",
    "weight",
    "blocking_issues_count",
    "has_tasks",
    "task_status",
    "_links",
    "references",
    "severity",
    "moved_to_id",
    "service_desk_reply_to",
    "epic_iid",
    "epic",
    "iteration",
    "health_status"
})
@Generated("jsonschema2pojo")
public class Issue {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("iid")
    private Integer iid;
    @JsonProperty("project_id")
    private Integer projectId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("state")
    private String state;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_at")
    private Object closedAt;
    @JsonProperty("closed_by")
    private Object closedBy;
    @JsonProperty("labels")
    private List<String> labels;
    @JsonProperty("milestone")
    private Object milestone;
    @JsonProperty("assignees")
    private List<Object> assignees;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("type")
    private String type;
    @JsonProperty("assignee")
    private Object assignee;
    @JsonProperty("user_notes_count")
    private Integer userNotesCount;
    @JsonProperty("merge_requests_count")
    private Integer mergeRequestsCount;
    @JsonProperty("upvotes")
    private Integer upvotes;
    @JsonProperty("downvotes")
    private Integer downvotes;
    @JsonProperty("due_date")
    private Object dueDate;
    @JsonProperty("confidential")
    private Boolean confidential;
    @JsonProperty("discussion_locked")
    private Object discussionLocked;
    @JsonProperty("issue_type")
    private String issueType;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("time_stats")
    private TimeStats timeStats;
    @JsonProperty("task_completion_status")
    private TaskCompletionStatus taskCompletionStatus;
    @JsonProperty("weight")
    private Object weight;
    @JsonProperty("blocking_issues_count")
    private Integer blockingIssuesCount;
    @JsonProperty("has_tasks")
    private Boolean hasTasks;
    @JsonProperty("task_status")
    private String taskStatus;
    @JsonProperty("_links")
    private Links links;
    @JsonProperty("references")
    private References references;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("moved_to_id")
    private Object movedToId;
    @JsonProperty("service_desk_reply_to")
    private Object serviceDeskReplyTo;
    @JsonProperty("epic_iid")
    private Object epicIid;
    @JsonProperty("epic")
    private Object epic;
    @JsonProperty("iteration")
    private Object iteration;
    @JsonProperty("health_status")
    private Object healthStatus;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("iid")
    public Integer getIid() {
        return iid;
    }

    @JsonProperty("iid")
    public void setIid(Integer iid) {
        this.iid = iid;
    }

    @JsonProperty("project_id")
    public Integer getProjectId() {
        return projectId;
    }

    @JsonProperty("project_id")
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("closed_by")
    public Object getClosedBy() {
        return closedBy;
    }

    @JsonProperty("closed_by")
    public void setClosedBy(Object closedBy) {
        this.closedBy = closedBy;
    }

    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @JsonProperty("milestone")
    public Object getMilestone() {
        return milestone;
    }

    @JsonProperty("milestone")
    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    @JsonProperty("assignees")
    public List<Object> getAssignees() {
        return assignees;
    }

    @JsonProperty("assignees")
    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("assignee")
    public Object getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("user_notes_count")
    public Integer getUserNotesCount() {
        return userNotesCount;
    }

    @JsonProperty("user_notes_count")
    public void setUserNotesCount(Integer userNotesCount) {
        this.userNotesCount = userNotesCount;
    }

    @JsonProperty("merge_requests_count")
    public Integer getMergeRequestsCount() {
        return mergeRequestsCount;
    }

    @JsonProperty("merge_requests_count")
    public void setMergeRequestsCount(Integer mergeRequestsCount) {
        this.mergeRequestsCount = mergeRequestsCount;
    }

    @JsonProperty("upvotes")
    public Integer getUpvotes() {
        return upvotes;
    }

    @JsonProperty("upvotes")
    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    @JsonProperty("downvotes")
    public Integer getDownvotes() {
        return downvotes;
    }

    @JsonProperty("downvotes")
    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }

    @JsonProperty("due_date")
    public Object getDueDate() {
        return dueDate;
    }

    @JsonProperty("due_date")
    public void setDueDate(Object dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty("confidential")
    public Boolean getConfidential() {
        return confidential;
    }

    @JsonProperty("confidential")
    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }

    @JsonProperty("discussion_locked")
    public Object getDiscussionLocked() {
        return discussionLocked;
    }

    @JsonProperty("discussion_locked")
    public void setDiscussionLocked(Object discussionLocked) {
        this.discussionLocked = discussionLocked;
    }

    @JsonProperty("issue_type")
    public String getIssueType() {
        return issueType;
    }

    @JsonProperty("issue_type")
    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @JsonProperty("time_stats")
    public TimeStats getTimeStats() {
        return timeStats;
    }

    @JsonProperty("time_stats")
    public void setTimeStats(TimeStats timeStats) {
        this.timeStats = timeStats;
    }

    @JsonProperty("task_completion_status")
    public TaskCompletionStatus getTaskCompletionStatus() {
        return taskCompletionStatus;
    }

    @JsonProperty("task_completion_status")
    public void setTaskCompletionStatus(TaskCompletionStatus taskCompletionStatus) {
        this.taskCompletionStatus = taskCompletionStatus;
    }

    @JsonProperty("weight")
    public Object getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Object weight) {
        this.weight = weight;
    }

    @JsonProperty("blocking_issues_count")
    public Integer getBlockingIssuesCount() {
        return blockingIssuesCount;
    }

    @JsonProperty("blocking_issues_count")
    public void setBlockingIssuesCount(Integer blockingIssuesCount) {
        this.blockingIssuesCount = blockingIssuesCount;
    }

    @JsonProperty("has_tasks")
    public Boolean getHasTasks() {
        return hasTasks;
    }

    @JsonProperty("has_tasks")
    public void setHasTasks(Boolean hasTasks) {
        this.hasTasks = hasTasks;
    }

    @JsonProperty("task_status")
    public String getTaskStatus() {
        return taskStatus;
    }

    @JsonProperty("task_status")
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("moved_to_id")
    public Object getMovedToId() {
        return movedToId;
    }

    @JsonProperty("moved_to_id")
    public void setMovedToId(Object movedToId) {
        this.movedToId = movedToId;
    }

    @JsonProperty("service_desk_reply_to")
    public Object getServiceDeskReplyTo() {
        return serviceDeskReplyTo;
    }

    @JsonProperty("service_desk_reply_to")
    public void setServiceDeskReplyTo(Object serviceDeskReplyTo) {
        this.serviceDeskReplyTo = serviceDeskReplyTo;
    }

    @JsonProperty("epic_iid")
    public Object getEpicIid() {
        return epicIid;
    }

    @JsonProperty("epic_iid")
    public void setEpicIid(Object epicIid) {
        this.epicIid = epicIid;
    }

    @JsonProperty("epic")
    public Object getEpic() {
        return epic;
    }

    @JsonProperty("epic")
    public void setEpic(Object epic) {
        this.epic = epic;
    }

    @JsonProperty("iteration")
    public Object getIteration() {
        return iteration;
    }

    @JsonProperty("iteration")
    public void setIteration(Object iteration) {
        this.iteration = iteration;
    }

    @JsonProperty("health_status")
    public Object getHealthStatus() {
        return healthStatus;
    }

    @JsonProperty("health_status")
    public void setHealthStatus(Object healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Issue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("iid");
        sb.append('=');
        sb.append(((this.iid == null)?"<null>":this.iid));
        sb.append(',');
        sb.append("projectId");
        sb.append('=');
        sb.append(((this.projectId == null)?"<null>":this.projectId));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("closedAt");
        sb.append('=');
        sb.append(((this.closedAt == null)?"<null>":this.closedAt));
        sb.append(',');
        sb.append("closedBy");
        sb.append('=');
        sb.append(((this.closedBy == null)?"<null>":this.closedBy));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("milestone");
        sb.append('=');
        sb.append(((this.milestone == null)?"<null>":this.milestone));
        sb.append(',');
        sb.append("assignees");
        sb.append('=');
        sb.append(((this.assignees == null)?"<null>":this.assignees));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("userNotesCount");
        sb.append('=');
        sb.append(((this.userNotesCount == null)?"<null>":this.userNotesCount));
        sb.append(',');
        sb.append("mergeRequestsCount");
        sb.append('=');
        sb.append(((this.mergeRequestsCount == null)?"<null>":this.mergeRequestsCount));
        sb.append(',');
        sb.append("upvotes");
        sb.append('=');
        sb.append(((this.upvotes == null)?"<null>":this.upvotes));
        sb.append(',');
        sb.append("downvotes");
        sb.append('=');
        sb.append(((this.downvotes == null)?"<null>":this.downvotes));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("confidential");
        sb.append('=');
        sb.append(((this.confidential == null)?"<null>":this.confidential));
        sb.append(',');
        sb.append("discussionLocked");
        sb.append('=');
        sb.append(((this.discussionLocked == null)?"<null>":this.discussionLocked));
        sb.append(',');
        sb.append("issueType");
        sb.append('=');
        sb.append(((this.issueType == null)?"<null>":this.issueType));
        sb.append(',');
        sb.append("webUrl");
        sb.append('=');
        sb.append(((this.webUrl == null)?"<null>":this.webUrl));
        sb.append(',');
        sb.append("timeStats");
        sb.append('=');
        sb.append(((this.timeStats == null)?"<null>":this.timeStats));
        sb.append(',');
        sb.append("taskCompletionStatus");
        sb.append('=');
        sb.append(((this.taskCompletionStatus == null)?"<null>":this.taskCompletionStatus));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("blockingIssuesCount");
        sb.append('=');
        sb.append(((this.blockingIssuesCount == null)?"<null>":this.blockingIssuesCount));
        sb.append(',');
        sb.append("hasTasks");
        sb.append('=');
        sb.append(((this.hasTasks == null)?"<null>":this.hasTasks));
        sb.append(',');
        sb.append("taskStatus");
        sb.append('=');
        sb.append(((this.taskStatus == null)?"<null>":this.taskStatus));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("movedToId");
        sb.append('=');
        sb.append(((this.movedToId == null)?"<null>":this.movedToId));
        sb.append(',');
        sb.append("serviceDeskReplyTo");
        sb.append('=');
        sb.append(((this.serviceDeskReplyTo == null)?"<null>":this.serviceDeskReplyTo));
        sb.append(',');
        sb.append("epicIid");
        sb.append('=');
        sb.append(((this.epicIid == null)?"<null>":this.epicIid));
        sb.append(',');
        sb.append("epic");
        sb.append('=');
        sb.append(((this.epic == null)?"<null>":this.epic));
        sb.append(',');
        sb.append("iteration");
        sb.append('=');
        sb.append(((this.iteration == null)?"<null>":this.iteration));
        sb.append(',');
        sb.append("healthStatus");
        sb.append('=');
        sb.append(((this.healthStatus == null)?"<null>":this.healthStatus));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
