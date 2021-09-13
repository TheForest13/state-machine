package com.theforest.statemachine.process.action;

import com.theforest.statemachine.process.Payload;
import com.theforest.statemachine.process.Step;
import com.theforest.statemachine.process.WorkflowStep;

public class ActionStep extends WorkflowStep {
    @Override
    public void action(Payload payload) {
        next(Step.NEXT_STEP, new Payload("next step"));
    }
}
