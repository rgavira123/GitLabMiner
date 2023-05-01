
package aiss.gitlabminer.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "short",
    "relative",
    "full"
})
@Generated("jsonschema2pojo")
public class References {

    @JsonProperty("short")
    private String _short;
    @JsonProperty("relative")
    private String relative;
    @JsonProperty("full")
    private String full;

    @JsonProperty("short")
    public String getShort() {
        return _short;
    }

    @JsonProperty("short")
    public void setShort(String _short) {
        this._short = _short;
    }

    @JsonProperty("relative")
    public String getRelative() {
        return relative;
    }

    @JsonProperty("relative")
    public void setRelative(String relative) {
        this.relative = relative;
    }

    @JsonProperty("full")
    public String getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(String full) {
        this.full = full;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(References.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_short");
        sb.append('=');
        sb.append(((this._short == null)?"<null>":this._short));
        sb.append(',');
        sb.append("relative");
        sb.append('=');
        sb.append(((this.relative == null)?"<null>":this.relative));
        sb.append(',');
        sb.append("full");
        sb.append('=');
        sb.append(((this.full == null)?"<null>":this.full));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
