package com.theforest.statemachine.process.action;

import com.theforest.statemachine.process.Payload;
import com.theforest.statemachine.process.WorkflowStep;

public class NextActionStep extends WorkflowStep {
    @Override
    public void action(Payload payload) {
        System.out.println("stop step");
    }
}
