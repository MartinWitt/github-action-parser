
package io.github.martinwitt.github_action_parser.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shell",
    "working-directory"
})
public class Run {

    /**
     * You can override the default shell settings in the runner's operating system using the shell keyword. You can use built-in shell keywords, or you can define a custom set of shell options.https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#jobsjob_idstepsshell
     * 
     */
    @JsonProperty("shell")
    @JsonPropertyDescription("You can override the default shell settings in the runner's operating system using the shell keyword. You can use built-in shell keywords, or you can define a custom set of shell options.")
    private Object shell;
    /**
     * Using the working-directory keyword, you can specify the working directory of where to run the command.https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsrun
     * 
     */
    @JsonProperty("working-directory")
    @JsonPropertyDescription("Using the working-directory keyword, you can specify the working directory of where to run the command.")
    private String workingDirectory;

    /**
     * You can override the default shell settings in the runner's operating system using the shell keyword. You can use built-in shell keywords, or you can define a custom set of shell options.https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#jobsjob_idstepsshell
     * 
     */
    @JsonProperty("shell")
    public Object getShell() {
        return shell;
    }

    /**
     * You can override the default shell settings in the runner's operating system using the shell keyword. You can use built-in shell keywords, or you can define a custom set of shell options.https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#jobsjob_idstepsshell
     * 
     */
    @JsonProperty("shell")
    public void setShell(Object shell) {
        this.shell = shell;
    }

    /**
     * Using the working-directory keyword, you can specify the working directory of where to run the command.https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsrun
     * 
     */
    @JsonProperty("working-directory")
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * Using the working-directory keyword, you can specify the working directory of where to run the command.https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsrun
     * 
     */
    @JsonProperty("working-directory")
    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Run.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shell");
        sb.append('=');
        sb.append(((this.shell == null)?"<null>":this.shell));
        sb.append(',');
        sb.append("workingDirectory");
        sb.append('=');
        sb.append(((this.workingDirectory == null)?"<null>":this.workingDirectory));
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
        result = ((result* 31)+((this.shell == null)? 0 :this.shell.hashCode()));
        result = ((result* 31)+((this.workingDirectory == null)? 0 :this.workingDirectory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Run) == false) {
            return false;
        }
        Run rhs = ((Run) other);
        return (((this.shell == rhs.shell)||((this.shell!= null)&&this.shell.equals(rhs.shell)))&&((this.workingDirectory == rhs.workingDirectory)||((this.workingDirectory!= null)&&this.workingDirectory.equals(rhs.workingDirectory))));
    }

}
