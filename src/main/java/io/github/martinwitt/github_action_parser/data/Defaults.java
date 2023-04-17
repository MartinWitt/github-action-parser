
package io.github.martinwitt.github_action_parser.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "run"
})
public class Defaults {

    @JsonProperty("run")
    private Run run;

    @JsonProperty("run")
    public Run getRun() {
        return run;
    }

    @JsonProperty("run")
    public void setRun(Run run) {
        this.run = run;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Defaults.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("run");
        sb.append('=');
        sb.append(((this.run == null)?"<null>":this.run));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.run == null)? 0 :this.run.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Defaults) == false) {
            return false;
        }
        Defaults rhs = ((Defaults) other);
        return ((this.run == rhs.run)||((this.run!= null)&&this.run.equals(rhs.run)));
    }

}
