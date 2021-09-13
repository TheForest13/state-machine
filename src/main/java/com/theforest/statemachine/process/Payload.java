package com.theforest.statemachine.process;

import java.io.Serializable;

public class Payload {
    private final Serializable field; // создать каждый тип передачи ?

    public Payload(Serializable field) {
        this.field = field;
    }

    public Object getObject() {
        return (Object) field;
    }

}
