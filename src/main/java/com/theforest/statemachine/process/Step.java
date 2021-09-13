package com.theforest.statemachine.process;

public enum Step {
    SOME_STEP,
    NEXT_STEP;
    private Payload payload;

    public Step withPayload(Payload payload) { // для передачи ?
        this.payload = payload;
        return this;
    }

    public Payload getPayload() {
        return payload;
    }
}
