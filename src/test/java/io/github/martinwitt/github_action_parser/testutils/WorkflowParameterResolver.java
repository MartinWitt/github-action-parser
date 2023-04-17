package io.github.martinwitt.github_action_parser.testutils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.github.martinwitt.github_action_parser.data.GitHubWorkflow;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class WorkflowParameterResolver implements ParameterResolver {

    private static final ObjectMapper MAPPER = new ObjectMapper(new YAMLFactory());

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
            throws ParameterResolutionException {
        if (!parameterContext.getDeclaringExecutable().isAnnotationPresent(WorkflowTest.class)) {
            throw new ParameterResolutionException("No WorkflowTest annotation found");
        }
        Class<?> parameterType = parameterContext.getParameter().getType();
        return parameterType == GitHubWorkflow.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
            throws ParameterResolutionException {
        Executable method = parameterContext.getDeclaringExecutable();
        var workflowTest = method.getAnnotation(WorkflowTest.class);
        String path = workflowTest.path();
        try {
            return MAPPER.readValue(Files.readString(Path.of(path)), GitHubWorkflow.class);
        } catch (IOException e) {
            throw new ParameterResolutionException("Could not read workflow file", e);
        }
    }
}
