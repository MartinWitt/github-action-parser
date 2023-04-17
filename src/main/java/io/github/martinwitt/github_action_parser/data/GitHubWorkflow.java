
package io.github.martinwitt.github_action_parser.data;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Github workflow file - https://help.github.com/en/articles/workflow-syntax-for-github-actions
 * <p>
 * This defines the schema for a Github workflow file
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "on",
    "jobs"
})
public class GitHubWorkflow {

    /**
     * The name of your workflow. GitHub displays the names of your workflows on your repository's actions page. If you omit this field, GitHub sets the name to the workflow's filename.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of your workflow. GitHub displays the names of your workflows on your repository's actions page. If you omit this field, GitHub sets the name to the workflow's filename.")
    private String name;
    /**
     * The name of the GitHub event that triggers the workflow
     * (Required)
     * 
     */
    @JsonProperty("on")
    @JsonPropertyDescription("The name of the GitHub event that triggers the workflow")
    private Object on;
    /**
     * A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the {@code jobs.<job_id>.needs} keyword.
     * 
     */
    @JsonProperty("jobs")
    @JsonPropertyDescription("A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the {@code jobs.<job_id>.needs} keyword.")
    private Jobs jobs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The name of your workflow. GitHub displays the names of your workflows on your repository's actions page. If you omit this field, GitHub sets the name to the workflow's filename.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of your workflow. GitHub displays the names of your workflows on your repository's actions page. If you omit this field, GitHub sets the name to the workflow's filename.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the GitHub event that triggers the workflow
     * (Required)
     * 
     */
    @JsonProperty("on")
    public Object getOn() {
        return on;
    }

    /**
     * The name of the GitHub event that triggers the workflow
     * (Required)
     * 
     */
    @JsonProperty("on")
    public void setOn(Object on) {
        this.on = on;
    }

    /**
     * A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the {@code jobs.<job_id>.needs} keyword.
     * 
     */
    @JsonProperty("jobs")
    public Jobs getJobs() {
        return jobs;
    }

    /**
     * A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the {@code jobs.<job_id>.needs} keyword.
     * 
     */
    @JsonProperty("jobs")
    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GitHubWorkflow.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("on");
        sb.append('=');
        sb.append(((this.on == null)?"<null>":this.on));
        sb.append(',');
        sb.append("jobs");
        sb.append('=');
        sb.append(((this.jobs == null)?"<null>":this.jobs));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.on == null)? 0 :this.on.hashCode()));
        result = ((result* 31)+((this.jobs == null)? 0 :this.jobs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GitHubWorkflow) == false) {
            return false;
        }
        GitHubWorkflow rhs = ((GitHubWorkflow) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.on == rhs.on)||((this.on!= null)&&this.on.equals(rhs.on))))&&((this.jobs == rhs.jobs)||((this.jobs!= null)&&this.jobs.equals(rhs.jobs))));
    }

}
