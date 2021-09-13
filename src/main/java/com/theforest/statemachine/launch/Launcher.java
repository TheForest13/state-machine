package com.theforest.statemachine.launch;

import com.theforest.statemachine.process.Step;
import com.theforest.statemachine.process.StepWorkflowEngine;
import com.theforest.statemachine.process.action.ActionStep;
import com.theforest.statemachine.process.action.NextActionStep;
import org.springframework.stereotype.Component;

@Component
public class Launcher {
    public void launch() {
        new StepWorkflowEngine( new ActionStep().step(Step.NEXT_STEP, new NextActionStep())).launch();
    }
}
