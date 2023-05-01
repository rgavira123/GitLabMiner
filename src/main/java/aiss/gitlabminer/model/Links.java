
package aiss.gitlabminer.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "notes",
    "award_emoji",
    "project",
    "closed_as_duplicate_of"
})
@Generated("jsonschema2pojo")
public class Links {

    @JsonProperty("self")
    private String self;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("award_emoji")
    private String awardEmoji;
    @JsonProperty("project")
    private String project;
    @JsonProperty("closed_as_duplicate_of")
    private Object closedAsDuplicateOf;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("award_emoji")
    public String getAwardEmoji() {
        return awardEmoji;
    }

    @JsonProperty("award_emoji")
    public void setAwardEmoji(String awardEmoji) {
        this.awardEmoji = awardEmoji;
    }

    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
    }

    @JsonProperty("closed_as_duplicate_of")
    public Object getClosedAsDuplicateOf() {
        return closedAsDuplicateOf;
    }

    @JsonProperty("closed_as_duplicate_of")
    public void setClosedAsDuplicateOf(Object closedAsDuplicateOf) {
        this.closedAsDuplicateOf = closedAsDuplicateOf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Links.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("awardEmoji");
        sb.append('=');
        sb.append(((this.awardEmoji == null)?"<null>":this.awardEmoji));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("closedAsDuplicateOf");
        sb.append('=');
        sb.append(((this.closedAsDuplicateOf == null)?"<null>":this.closedAsDuplicateOf));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
