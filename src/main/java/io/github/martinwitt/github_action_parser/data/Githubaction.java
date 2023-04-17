
package io.github.martinwitt.github_action_parser.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "on",
    "env",
    "defaults",
    "concurrency",
    "jobs",
    "run-name",
    "permissions"
})
public class Githubaction {

    /**
     * The name of your workflow. GitHub displays the names of your workflows on your repository's actions page. If you omit this field, GitHub sets the name to the workflow's filename.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of your workflow. GitHub displays the names of your workflows on your repository's actions page. If you omit this field, GitHub sets the name to the workflow's filename.")
    private String name;
    /**
     * The name of the GitHub event that triggers the workflow. You can provide a single event string, array of events, array of event types, or an event configuration map that schedules a workflow or restricts the execution of a workflow to specific files, tags, or branch changes. For a list of available events, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#on
     * (Required)
     * 
     */
    @JsonProperty("on")
    @JsonPropertyDescription("The name of the GitHub event that triggers the workflow. You can provide a single event string, array of events, array of event types, or an event configuration map that schedules a workflow or restricts the execution of a workflow to specific files, tags, or branch changes. For a list of available events, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows.")
    private Object on;
    /**
     * To set custom environment variables, you need to specify the variables in the workflow file. You can define environment variables for a step, job, or entire workflow using the jobs.<job_id>.steps[*].env, jobs.<job_id>.env, and env keywords. For more information, see https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsenv https://docs.github.com/en/actions/learn-github-actions/environment-variables
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("To set custom environment variables, you need to specify the variables in the workflow file. You can define environment variables for a step, job, or entire workflow using the jobs.<job_id>.steps[*].env, jobs.<job_id>.env, and env keywords. For more information, see https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsenv")
    private Object env;
    @JsonProperty("defaults")
    private Defaults defaults;
    /**
     * Concurrency ensures that only a single job or workflow using the same concurrency group will run at a time. A concurrency group can be any string or expression. The expression can use any context except for the secrets context. 
     * You can also specify concurrency at the workflow level. 
     * When a concurrent job or workflow is queued, if another job or workflow using the same concurrency group in the repository is in progress, the queued job or workflow will be pending. Any previously pending job or workflow in the concurrency group will be canceled. To also cancel any currently running job or workflow in the same concurrency group, specify cancel-in-progress: true.https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#concurrency
     * 
     */
    @JsonProperty("concurrency")
    @JsonPropertyDescription("Concurrency ensures that only a single job or workflow using the same concurrency group will run at a time. A concurrency group can be any string or expression. The expression can use any context except for the secrets context. \nYou can also specify concurrency at the workflow level. \nWhen a concurrent job or workflow is queued, if another job or workflow using the same concurrency group in the repository is in progress, the queued job or workflow will be pending. Any previously pending job or workflow in the concurrency group will be canceled. To also cancel any currently running job or workflow in the same concurrency group, specify cancel-in-progress: true.")
    private Object concurrency;
    /**
     * A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the jobs.<job_id>.needs keyword.
     * Each job runs in a fresh instance of the virtual environment specified by runs-on.
     * You can run an unlimited number of jobs as long as you are within the workflow usage limits. For more information, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#usage-limits.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobs
     * (Required)
     * 
     */
    @JsonProperty("jobs")
    @JsonPropertyDescription("A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the jobs.<job_id>.needs keyword.\nEach job runs in a fresh instance of the virtual environment specified by runs-on.\nYou can run an unlimited number of jobs as long as you are within the workflow usage limits. For more information, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#usage-limits.")
    private Jobs__1 jobs;
    /**
     * The name for workflow runs generated from the workflow. GitHub displays the workflow run name in the list of workflow runs on your repository's 'Actions' tab.https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#run-name
     * 
     */
    @JsonProperty("run-name")
    @JsonPropertyDescription("The name for workflow runs generated from the workflow. GitHub displays the workflow run name in the list of workflow runs on your repository's 'Actions' tab.")
    private String runName;
    /**
     * You can modify the default permissions granted to the GITHUB_TOKEN, adding or removing access as required, so that you only allow the minimum required access.https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#permissions
     * 
     */
    @JsonProperty("permissions")
    @JsonPropertyDescription("You can modify the default permissions granted to the GITHUB_TOKEN, adding or removing access as required, so that you only allow the minimum required access.")
    private Object permissions;

    /**
     * The name of your workflow. GitHub displays the names of your workflows on your repository's actions page. If you omit this field, GitHub sets the name to the workflow's filename.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of your workflow. GitHub displays the names of your workflows on your repository's actions page. If you omit this field, GitHub sets the name to the workflow's filename.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#name
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the GitHub event that triggers the workflow. You can provide a single event string, array of events, array of event types, or an event configuration map that schedules a workflow or restricts the execution of a workflow to specific files, tags, or branch changes. For a list of available events, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#on
     * (Required)
     * 
     */
    @JsonProperty("on")
    public Object getOn() {
        return on;
    }

    /**
     * The name of the GitHub event that triggers the workflow. You can provide a single event string, array of events, array of event types, or an event configuration map that schedules a workflow or restricts the execution of a workflow to specific files, tags, or branch changes. For a list of available events, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#on
     * (Required)
     * 
     */
    @JsonProperty("on")
    public void setOn(Object on) {
        this.on = on;
    }

    /**
     * To set custom environment variables, you need to specify the variables in the workflow file. You can define environment variables for a step, job, or entire workflow using the jobs.<job_id>.steps[*].env, jobs.<job_id>.env, and env keywords. For more information, see https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsenv https://docs.github.com/en/actions/learn-github-actions/environment-variables
     * 
     */
    @JsonProperty("env")
    public Object getEnv() {
        return env;
    }

    /**
     * To set custom environment variables, you need to specify the variables in the workflow file. You can define environment variables for a step, job, or entire workflow using the jobs.<job_id>.steps[*].env, jobs.<job_id>.env, and env keywords. For more information, see https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsenv https://docs.github.com/en/actions/learn-github-actions/environment-variables
     * 
     */
    @JsonProperty("env")
    public void setEnv(Object env) {
        this.env = env;
    }

    @JsonProperty("defaults")
    public Defaults getDefaults() {
        return defaults;
    }

    @JsonProperty("defaults")
    public void setDefaults(Defaults defaults) {
        this.defaults = defaults;
    }

    /**
     * Concurrency ensures that only a single job or workflow using the same concurrency group will run at a time. A concurrency group can be any string or expression. The expression can use any context except for the secrets context. 
     * You can also specify concurrency at the workflow level. 
     * When a concurrent job or workflow is queued, if another job or workflow using the same concurrency group in the repository is in progress, the queued job or workflow will be pending. Any previously pending job or workflow in the concurrency group will be canceled. To also cancel any currently running job or workflow in the same concurrency group, specify cancel-in-progress: true.https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#concurrency
     * 
     */
    @JsonProperty("concurrency")
    public Object getConcurrency() {
        return concurrency;
    }

    /**
     * Concurrency ensures that only a single job or workflow using the same concurrency group will run at a time. A concurrency group can be any string or expression. The expression can use any context except for the secrets context. 
     * You can also specify concurrency at the workflow level. 
     * When a concurrent job or workflow is queued, if another job or workflow using the same concurrency group in the repository is in progress, the queued job or workflow will be pending. Any previously pending job or workflow in the concurrency group will be canceled. To also cancel any currently running job or workflow in the same concurrency group, specify cancel-in-progress: true.https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#concurrency
     * 
     */
    @JsonProperty("concurrency")
    public void setConcurrency(Object concurrency) {
        this.concurrency = concurrency;
    }

    /**
     * A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the jobs.<job_id>.needs keyword.
     * Each job runs in a fresh instance of the virtual environment specified by runs-on.
     * You can run an unlimited number of jobs as long as you are within the workflow usage limits. For more information, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#usage-limits.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobs
     * (Required)
     * 
     */
    @JsonProperty("jobs")
    public Jobs__1 getJobs() {
        return jobs;
    }

    /**
     * A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the jobs.<job_id>.needs keyword.
     * Each job runs in a fresh instance of the virtual environment specified by runs-on.
     * You can run an unlimited number of jobs as long as you are within the workflow usage limits. For more information, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#usage-limits.https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobs
     * (Required)
     * 
     */
    @JsonProperty("jobs")
    public void setJobs(Jobs__1 jobs) {
        this.jobs = jobs;
    }

    /**
     * The name for workflow runs generated from the workflow. GitHub displays the workflow run name in the list of workflow runs on your repository's 'Actions' tab.https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#run-name
     * 
     */
    @JsonProperty("run-name")
    public String getRunName() {
        return runName;
    }

    /**
     * The name for workflow runs generated from the workflow. GitHub displays the workflow run name in the list of workflow runs on your repository's 'Actions' tab.https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#run-name
     * 
     */
    @JsonProperty("run-name")
    public void setRunName(String runName) {
        this.runName = runName;
    }

    /**
     * You can modify the default permissions granted to the GITHUB_TOKEN, adding or removing access as required, so that you only allow the minimum required access.https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#permissions
     * 
     */
    @JsonProperty("permissions")
    public Object getPermissions() {
        return permissions;
    }

    /**
     * You can modify the default permissions granted to the GITHUB_TOKEN, adding or removing access as required, so that you only allow the minimum required access.https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#permissions
     * 
     */
    @JsonProperty("permissions")
    public void setPermissions(Object permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Githubaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("on");
        sb.append('=');
        sb.append(((this.on == null)?"<null>":this.on));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("defaults");
        sb.append('=');
        sb.append(((this.defaults == null)?"<null>":this.defaults));
        sb.append(',');
        sb.append("concurrency");
        sb.append('=');
        sb.append(((this.concurrency == null)?"<null>":this.concurrency));
        sb.append(',');
        sb.append("jobs");
        sb.append('=');
        sb.append(((this.jobs == null)?"<null>":this.jobs));
        sb.append(',');
        sb.append("runName");
        sb.append('=');
        sb.append(((this.runName == null)?"<null>":this.runName));
        sb.append(',');
        sb.append("permissions");
        sb.append('=');
        sb.append(((this.permissions == null)?"<null>":this.permissions));
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
        result = ((result* 31)+((this.defaults == null)? 0 :this.defaults.hashCode()));
        result = ((result* 31)+((this.runName == null)? 0 :this.runName.hashCode()));
        result = ((result* 31)+((this.permissions == null)? 0 :this.permissions.hashCode()));
        result = ((result* 31)+((this.jobs == null)? 0 :this.jobs.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.on == null)? 0 :this.on.hashCode()));
        result = ((result* 31)+((this.concurrency == null)? 0 :this.concurrency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Githubaction) == false) {
            return false;
        }
        Githubaction rhs = ((Githubaction) other);
        return (((((((((this.defaults == rhs.defaults)||((this.defaults!= null)&&this.defaults.equals(rhs.defaults)))&&((this.runName == rhs.runName)||((this.runName!= null)&&this.runName.equals(rhs.runName))))&&((this.permissions == rhs.permissions)||((this.permissions!= null)&&this.permissions.equals(rhs.permissions))))&&((this.jobs == rhs.jobs)||((this.jobs!= null)&&this.jobs.equals(rhs.jobs))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.on == rhs.on)||((this.on!= null)&&this.on.equals(rhs.on))))&&((this.concurrency == rhs.concurrency)||((this.concurrency!= null)&&this.concurrency.equals(rhs.concurrency))));
    }

}
