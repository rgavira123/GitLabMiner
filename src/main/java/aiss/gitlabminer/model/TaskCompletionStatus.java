
package aiss.gitlabminer.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "completed_count"
})
@Generated("jsonschema2pojo")
public class TaskCompletionStatus {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("completed_count")
    private Integer completedCount;

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("completed_count")
    public Integer getCompletedCount() {
        return completedCount;
    }

    @JsonProperty("completed_count")
    public void setCompletedCount(Integer completedCount) {
        this.completedCount = completedCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskCompletionStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("completedCount");
        sb.append('=');
        sb.append(((this.completedCount == null)?"<null>":this.completedCount));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
