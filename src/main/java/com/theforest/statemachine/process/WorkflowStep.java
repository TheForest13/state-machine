package com.theforest.statemachine.process;

import java.util.HashMap;
import java.util.Map;

public abstract class WorkflowStep {
    private static final Map<Step, WorkflowStep> workflowStepMap = new HashMap<>();

    public WorkflowStep step(Step step, WorkflowStep workflowStep) {
        workflowStepMap.put(step, workflowStep);
        return this;
    }

    public abstract void action(Payload payload);

    public void next(Step step, Payload payload) {
        workflowStepMap.get(step).action(payload);
    }

}
