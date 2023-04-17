
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "uses",
    "with",
    "env",
    "if",
    "run",
    "working-directory",
    "continue-on-error",
    "timeout-minutes"
})
public class Step {

    /**
     * A name for your step to display on GitHub.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A name for your step to display on GitHub.")
    private String name;
    /**
     * Selects an action to run as part of a step in your job. An action is a reusable unit of code. You can use an action defined in the same repository as the workflow, a public repository, or in a published Docker container image.
     * 
     */
    @JsonProperty("uses")
    @JsonPropertyDescription("Selects an action to run as part of a step in your job. An action is a reusable unit of code. You can use an action defined in the same repository as the workflow, a public repository, or in a published Docker container image.")
    private String uses;
    /**
     * A map of the input parameters defined by the action. Each input parameter is a key/value pair. Input parameters are set as environment variables. The variable is prefixed with INPUT_ and converted to upper case.
     * 
     */
    @JsonProperty("with")
    @JsonPropertyDescription("A map of the input parameters defined by the action. Each input parameter is a key/value pair. Input parameters are set as environment variables. The variable is prefixed with INPUT_ and converted to upper case.")
    private With with;
    /**
     * Sets environment variables for steps to use in the virtual environment. Public actions may specify expected environment variables in the README file. If you are setting a secret in an environment variable, you must set secrets using the secrets context.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("Sets environment variables for steps to use in the virtual environment. Public actions may specify expected environment variables in the README file. If you are setting a secret in an environment variable, you must set secrets using the secrets context.")
    private Env env;
    /**
     * Identifies any steps that must complete successfully before this step will run. It can be a string or an array of strings. If a step fails, all steps that need it will also fail unless the steps use a conditional statement that causes the step to continue.
     * 
     */
    @JsonProperty("if")
    @JsonPropertyDescription("Identifies any steps that must complete successfully before this step will run. It can be a string or an array of strings. If a step fails, all steps that need it will also fail unless the steps use a conditional statement that causes the step to continue.")
    private String _if;
    /**
     * Runs command line programs using the operating system's shell. If you do not provide a name, the step name will default to the run command. Commands run using non-login shells by default.
     * 
     */
    @JsonProperty("run")
    @JsonPropertyDescription("Runs command line programs using the operating system's shell. If you do not provide a name, the step name will default to the run command. Commands run using non-login shells by default.")
    private String run;
    /**
     * The default directory that the action uses in a job's workspace.
     * 
     */
    @JsonProperty("working-directory")
    @JsonPropertyDescription("The default directory that the action uses in a job's workspace.")
    private String workingDirectory;
    /**
     * Prevents a job from failing when a step fails. Set to true to allow a job to pass when this step fails.
     * 
     */
    @JsonProperty("continue-on-error")
    @JsonPropertyDescription("Prevents a job from failing when a step fails. Set to true to allow a job to pass when this step fails.")
    private Boolean continueOnError;
    /**
     * The maximum number of minutes to let a workflow run before GitHub automatically cancels it.
     * 
     */
    @JsonProperty("timeout-minutes")
    @JsonPropertyDescription("The maximum number of minutes to let a workflow run before GitHub automatically cancels it.")
    private Double timeoutMinutes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * A name for your step to display on GitHub.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A name for your step to display on GitHub.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Selects an action to run as part of a step in your job. An action is a reusable unit of code. You can use an action defined in the same repository as the workflow, a public repository, or in a published Docker container image.
     * 
     */
    @JsonProperty("uses")
    public String getUses() {
        return uses;
    }

    /**
     * Selects an action to run as part of a step in your job. An action is a reusable unit of code. You can use an action defined in the same repository as the workflow, a public repository, or in a published Docker container image.
     * 
     */
    @JsonProperty("uses")
    public void setUses(String uses) {
        this.uses = uses;
    }

    /**
     * A map of the input parameters defined by the action. Each input parameter is a key/value pair. Input parameters are set as environment variables. The variable is prefixed with INPUT_ and converted to upper case.
     * 
     */
    @JsonProperty("with")
    public With getWith() {
        return with;
    }

    /**
     * A map of the input parameters defined by the action. Each input parameter is a key/value pair. Input parameters are set as environment variables. The variable is prefixed with INPUT_ and converted to upper case.
     * 
     */
    @JsonProperty("with")
    public void setWith(With with) {
        this.with = with;
    }

    /**
     * Sets environment variables for steps to use in the virtual environment. Public actions may specify expected environment variables in the README file. If you are setting a secret in an environment variable, you must set secrets using the secrets context.
     * 
     */
    @JsonProperty("env")
    public Env getEnv() {
        return env;
    }

    /**
     * Sets environment variables for steps to use in the virtual environment. Public actions may specify expected environment variables in the README file. If you are setting a secret in an environment variable, you must set secrets using the secrets context.
     * 
     */
    @JsonProperty("env")
    public void setEnv(Env env) {
        this.env = env;
    }

    /**
     * Identifies any steps that must complete successfully before this step will run. It can be a string or an array of strings. If a step fails, all steps that need it will also fail unless the steps use a conditional statement that causes the step to continue.
     * 
     */
    @JsonProperty("if")
    public String getIf() {
        return _if;
    }

    /**
     * Identifies any steps that must complete successfully before this step will run. It can be a string or an array of strings. If a step fails, all steps that need it will also fail unless the steps use a conditional statement that causes the step to continue.
     * 
     */
    @JsonProperty("if")
    public void setIf(String _if) {
        this._if = _if;
    }

    /**
     * Runs command line programs using the operating system's shell. If you do not provide a name, the step name will default to the run command. Commands run using non-login shells by default.
     * 
     */
    @JsonProperty("run")
    public String getRun() {
        return run;
    }

    /**
     * Runs command line programs using the operating system's shell. If you do not provide a name, the step name will default to the run command. Commands run using non-login shells by default.
     * 
     */
    @JsonProperty("run")
    public void setRun(String run) {
        this.run = run;
    }

    /**
     * The default directory that the action uses in a job's workspace.
     * 
     */
    @JsonProperty("working-directory")
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * The default directory that the action uses in a job's workspace.
     * 
     */
    @JsonProperty("working-directory")
    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * Prevents a job from failing when a step fails. Set to true to allow a job to pass when this step fails.
     * 
     */
    @JsonProperty("continue-on-error")
    public Boolean getContinueOnError() {
        return continueOnError;
    }

    /**
     * Prevents a job from failing when a step fails. Set to true to allow a job to pass when this step fails.
     * 
     */
    @JsonProperty("continue-on-error")
    public void setContinueOnError(Boolean continueOnError) {
        this.continueOnError = continueOnError;
    }

    /**
     * The maximum number of minutes to let a workflow run before GitHub automatically cancels it.
     * 
     */
    @JsonProperty("timeout-minutes")
    public Double getTimeoutMinutes() {
        return timeoutMinutes;
    }

    /**
     * The maximum number of minutes to let a workflow run before GitHub automatically cancels it.
     * 
     */
    @JsonProperty("timeout-minutes")
    public void setTimeoutMinutes(Double timeoutMinutes) {
        this.timeoutMinutes = timeoutMinutes;
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
        sb.append(Step.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("uses");
        sb.append('=');
        sb.append(((this.uses == null)?"<null>":this.uses));
        sb.append(',');
        sb.append("with");
        sb.append('=');
        sb.append(((this.with == null)?"<null>":this.with));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("_if");
        sb.append('=');
        sb.append(((this._if == null)?"<null>":this._if));
        sb.append(',');
        sb.append("run");
        sb.append('=');
        sb.append(((this.run == null)?"<null>":this.run));
        sb.append(',');
        sb.append("workingDirectory");
        sb.append('=');
        sb.append(((this.workingDirectory == null)?"<null>":this.workingDirectory));
        sb.append(',');
        sb.append("continueOnError");
        sb.append('=');
        sb.append(((this.continueOnError == null)?"<null>":this.continueOnError));
        sb.append(',');
        sb.append("timeoutMinutes");
        sb.append('=');
        sb.append(((this.timeoutMinutes == null)?"<null>":this.timeoutMinutes));
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
        result = ((result* 31)+((this.with == null)? 0 :this.with.hashCode()));
        result = ((result* 31)+((this.workingDirectory == null)? 0 :this.workingDirectory.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.uses == null)? 0 :this.uses.hashCode()));
        result = ((result* 31)+((this.run == null)? 0 :this.run.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this._if == null)? 0 :this._if.hashCode()));
        result = ((result* 31)+((this.timeoutMinutes == null)? 0 :this.timeoutMinutes.hashCode()));
        result = ((result* 31)+((this.continueOnError == null)? 0 :this.continueOnError.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Step) == false) {
            return false;
        }
        Step rhs = ((Step) other);
        return (((((((((((this.with == rhs.with)||((this.with!= null)&&this.with.equals(rhs.with)))&&((this.workingDirectory == rhs.workingDirectory)||((this.workingDirectory!= null)&&this.workingDirectory.equals(rhs.workingDirectory))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.uses == rhs.uses)||((this.uses!= null)&&this.uses.equals(rhs.uses))))&&((this.run == rhs.run)||((this.run!= null)&&this.run.equals(rhs.run))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this._if == rhs._if)||((this._if!= null)&&this._if.equals(rhs._if))))&&((this.timeoutMinutes == rhs.timeoutMinutes)||((this.timeoutMinutes!= null)&&this.timeoutMinutes.equals(rhs.timeoutMinutes))))&&((this.continueOnError == rhs.continueOnError)||((this.continueOnError!= null)&&this.continueOnError.equals(rhs.continueOnError))));
    }

}
