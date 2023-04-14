package io.github.martinwitt.github_action_parser.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.github_action_parser.data.Workflow;
import io.github.martinwitt.github_action_parser.testutils.WorkflowTest;
import org.junit.jupiter.api.Test;

/**
 * This class contains basic tests for the header of a workflow file.
 */
class WorkflowName {

    @WorkflowTest(path = "src/test/resources/header/WorflowWithName.yml")
    @Test
    void testWorkflowName(Workflow workflow) {
        assertEquals("Release", workflow.getName());
    }
}
