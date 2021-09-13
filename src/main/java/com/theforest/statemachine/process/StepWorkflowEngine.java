package com.theforest.statemachine.process;

public class StepWorkflowEngine {
    private final WorkflowStep step;

    public StepWorkflowEngine(WorkflowStep step) {
        this.step = step;
    }

    // ToDo нужно ввести содержимое Payload
    public void launch() {
        step.action(new Payload(""));
    }
}
