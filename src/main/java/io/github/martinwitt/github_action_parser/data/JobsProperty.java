
package io.github.martinwitt.github_action_parser.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Each job must have an id to associate with the job. The key job_id is a string and its value is a map of the job's configuration data. You must replace {@code <job_id>} with a string that is unique to the jobs object. The {@code <job_id>} must start with a letter or _ and contain only alphanumeric characters, -, or _.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "needs",
    "runs-on",
    "steps"
})
public class JobsProperty {

    /**
     * The name of the job displayed on GitHub.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the job displayed on GitHub.")
    private String name;
    /**
     * Identifies any jobs that must complete successfully before this job will run. It can be a string or array of strings. If a job fails, all jobs that need it will also fail unless the jobs use a conditional statement that causes the job to continue.
     * 
     */
    @JsonProperty("needs")
    @JsonPropertyDescription("Identifies any jobs that must complete successfully before this job will run. It can be a string or array of strings. If a job fails, all jobs that need it will also fail unless the jobs use a conditional statement that causes the job to continue.")
    private Object needs;
    /**
     * The type of virtual host machine to run the job on. Each job runs with a fresh instance of the virtual environment specified in by runs-on
     * (Required)
     * 
     */
    @JsonProperty("runs-on")
    @JsonPropertyDescription("The type of virtual host machine to run the job on. Each job runs with a fresh instance of the virtual environment specified in by runs-on")
    private JobsProperty.RunsOn runsOn = JobsProperty.RunsOn.fromValue("ubuntu-latest");
    /**
     * A job contains a sequence of tasks called steps. Steps can run commands, run setup tasks, or run an action in your repository, a public repository, or an action published in a Docker registry. Not all steps run actions, but all actions are run as a step. Each step runs in its own process in the virtual environment and has access to the workspace and filesystem. Because steps are run in their own process, changes to environment variables are not preserved between steps. GitHub provides built-in steps to set up and complete a job.
     * 
     */
    @JsonProperty("steps")
    @JsonPropertyDescription("A job contains a sequence of tasks called steps. Steps can run commands, run setup tasks, or run an action in your repository, a public repository, or an action published in a Docker registry. Not all steps run actions, but all actions are run as a step. Each step runs in its own process in the virtual environment and has access to the workspace and filesystem. Because steps are run in their own process, changes to environment variables are not preserved between steps. GitHub provides built-in steps to set up and complete a job.")
    private List<Step> steps = new ArrayList<Step>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The name of the job displayed on GitHub.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the job displayed on GitHub.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Identifies any jobs that must complete successfully before this job will run. It can be a string or array of strings. If a job fails, all jobs that need it will also fail unless the jobs use a conditional statement that causes the job to continue.
     * 
     */
    @JsonProperty("needs")
    public Object getNeeds() {
        return needs;
    }

    /**
     * Identifies any jobs that must complete successfully before this job will run. It can be a string or array of strings. If a job fails, all jobs that need it will also fail unless the jobs use a conditional statement that causes the job to continue.
     * 
     */
    @JsonProperty("needs")
    public void setNeeds(Object needs) {
        this.needs = needs;
    }

    /**
     * The type of virtual host machine to run the job on. Each job runs with a fresh instance of the virtual environment specified in by runs-on
     * (Required)
     * 
     */
    @JsonProperty("runs-on")
    public JobsProperty.RunsOn getRunsOn() {
        return runsOn;
    }

    /**
     * The type of virtual host machine to run the job on. Each job runs with a fresh instance of the virtual environment specified in by runs-on
     * (Required)
     * 
     */
    @JsonProperty("runs-on")
    public void setRunsOn(JobsProperty.RunsOn runsOn) {
        this.runsOn = runsOn;
    }

    /**
     * A job contains a sequence of tasks called steps. Steps can run commands, run setup tasks, or run an action in your repository, a public repository, or an action published in a Docker registry. Not all steps run actions, but all actions are run as a step. Each step runs in its own process in the virtual environment and has access to the workspace and filesystem. Because steps are run in their own process, changes to environment variables are not preserved between steps. GitHub provides built-in steps to set up and complete a job.
     * 
     */
    @JsonProperty("steps")
    public List<Step> getSteps() {
        return steps;
    }

    /**
     * A job contains a sequence of tasks called steps. Steps can run commands, run setup tasks, or run an action in your repository, a public repository, or an action published in a Docker registry. Not all steps run actions, but all actions are run as a step. Each step runs in its own process in the virtual environment and has access to the workspace and filesystem. Because steps are run in their own process, changes to environment variables are not preserved between steps. GitHub provides built-in steps to set up and complete a job.
     * 
     */
    @JsonProperty("steps")
    public void setSteps(List<Step> steps) {
        this.steps = steps;
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
        sb.append(JobsProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("needs");
        sb.append('=');
        sb.append(((this.needs == null)?"<null>":this.needs));
        sb.append(',');
        sb.append("runsOn");
        sb.append('=');
        sb.append(((this.runsOn == null)?"<null>":this.runsOn));
        sb.append(',');
        sb.append("steps");
        sb.append('=');
        sb.append(((this.steps == null)?"<null>":this.steps));
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
        result = ((result* 31)+((this.needs == null)? 0 :this.needs.hashCode()));
        result = ((result* 31)+((this.runsOn == null)? 0 :this.runsOn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.steps == null)? 0 :this.steps.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobsProperty) == false) {
            return false;
        }
        JobsProperty rhs = ((JobsProperty) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.needs == rhs.needs)||((this.needs!= null)&&this.needs.equals(rhs.needs))))&&((this.runsOn == rhs.runsOn)||((this.runsOn!= null)&&this.runsOn.equals(rhs.runsOn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.steps == rhs.steps)||((this.steps!= null)&&this.steps.equals(rhs.steps))));
    }


    /**
     * The type of virtual host machine to run the job on. Each job runs with a fresh instance of the virtual environment specified in by runs-on
     * 
     */
    public enum RunsOn {

        UBUNTU_LATEST("ubuntu-latest"),
        UBUNTU_18_04("ubuntu-18.04"),
        UBUNTU_16_04("ubuntu-16.04"),
        WINDOWS_LATEST("windows-latest"),
        WINDOWS_2019("windows-2019"),
        WINDOWS_2016("windows-2016"),
        MAC_OS_LATEST("macOS-latest"),
        MAC_OS_10_14("macOS-10.14");
        private final String value;
        private final static Map<String, JobsProperty.RunsOn> CONSTANTS = new HashMap<String, JobsProperty.RunsOn>();

        static {
            for (JobsProperty.RunsOn c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RunsOn(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static JobsProperty.RunsOn fromValue(String value) {
            JobsProperty.RunsOn constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
