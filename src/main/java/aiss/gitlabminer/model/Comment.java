
package aiss.gitlabminer.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "body",
    "attachment",
    "author",
    "created_at",
    "updated_at",
    "system",
    "noteable_id",
    "noteable_type",
    "project_id",
    "resolvable",
    "confidential",
    "internal",
    "noteable_iid",
    "commands_changes"
})
@Generated("jsonschema2pojo")
public class Comment {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("body")
    private String body;
    @JsonProperty("attachment")
    private Object attachment;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("system")
    private Boolean system;
    @JsonProperty("noteable_id")
    private Integer noteableId;
    @JsonProperty("noteable_type")
    private String noteableType;
    @JsonProperty("project_id")
    private Integer projectId;
    @JsonProperty("resolvable")
    private Boolean resolvable;
    @JsonProperty("confidential")
    private Boolean confidential;
    @JsonProperty("internal")
    private Boolean internal;
    @JsonProperty("noteable_iid")
    private Integer noteableIid;
    @JsonProperty("commands_changes")
    private CommandsChanges commandsChanges;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("attachment")
    public Object getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Object attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
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

    @JsonProperty("system")
    public Boolean getSystem() {
        return system;
    }

    @JsonProperty("system")
    public void setSystem(Boolean system) {
        this.system = system;
    }

    @JsonProperty("noteable_id")
    public Integer getNoteableId() {
        return noteableId;
    }

    @JsonProperty("noteable_id")
    public void setNoteableId(Integer noteableId) {
        this.noteableId = noteableId;
    }

    @JsonProperty("noteable_type")
    public String getNoteableType() {
        return noteableType;
    }

    @JsonProperty("noteable_type")
    public void setNoteableType(String noteableType) {
        this.noteableType = noteableType;
    }

    @JsonProperty("project_id")
    public Integer getProjectId() {
        return projectId;
    }

    @JsonProperty("project_id")
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @JsonProperty("resolvable")
    public Boolean getResolvable() {
        return resolvable;
    }

    @JsonProperty("resolvable")
    public void setResolvable(Boolean resolvable) {
        this.resolvable = resolvable;
    }

    @JsonProperty("confidential")
    public Boolean getConfidential() {
        return confidential;
    }

    @JsonProperty("confidential")
    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }

    @JsonProperty("internal")
    public Boolean getInternal() {
        return internal;
    }

    @JsonProperty("internal")
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    @JsonProperty("noteable_iid")
    public Integer getNoteableIid() {
        return noteableIid;
    }

    @JsonProperty("noteable_iid")
    public void setNoteableIid(Integer noteableIid) {
        this.noteableIid = noteableIid;
    }

    @JsonProperty("commands_changes")
    public CommandsChanges getCommandsChanges() {
        return commandsChanges;
    }

    @JsonProperty("commands_changes")
    public void setCommandsChanges(CommandsChanges commandsChanges) {
        this.commandsChanges = commandsChanges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("body");
        sb.append('=');
        sb.append(((this.body == null)?"<null>":this.body));
        sb.append(',');
        sb.append("attachment");
        sb.append('=');
        sb.append(((this.attachment == null)?"<null>":this.attachment));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("noteableId");
        sb.append('=');
        sb.append(((this.noteableId == null)?"<null>":this.noteableId));
        sb.append(',');
        sb.append("noteableType");
        sb.append('=');
        sb.append(((this.noteableType == null)?"<null>":this.noteableType));
        sb.append(',');
        sb.append("projectId");
        sb.append('=');
        sb.append(((this.projectId == null)?"<null>":this.projectId));
        sb.append(',');
        sb.append("resolvable");
        sb.append('=');
        sb.append(((this.resolvable == null)?"<null>":this.resolvable));
        sb.append(',');
        sb.append("confidential");
        sb.append('=');
        sb.append(((this.confidential == null)?"<null>":this.confidential));
        sb.append(',');
        sb.append("internal");
        sb.append('=');
        sb.append(((this.internal == null)?"<null>":this.internal));
        sb.append(',');
        sb.append("noteableIid");
        sb.append('=');
        sb.append(((this.noteableIid == null)?"<null>":this.noteableIid));
        sb.append(',');
        sb.append("commandsChanges");
        sb.append('=');
        sb.append(((this.commandsChanges == null)?"<null>":this.commandsChanges));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
