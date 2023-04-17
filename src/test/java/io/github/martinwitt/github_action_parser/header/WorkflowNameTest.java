package io.github.martinwitt.github_action_parser.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.github_action_parser.data.Githubaction;
import io.github.martinwitt.github_action_parser.testutils.WorkflowTest;

/**
 * This class contains basic tests for the header of a workflow file.
 */
class WorkflowNameTest {

    @WorkflowTest(path = "src/test/resources/header/WorflowWithName.yml")
    void testWorkflowName(Githubaction workflow) {
        assertEquals("Release", workflow.getName());
    }
}
