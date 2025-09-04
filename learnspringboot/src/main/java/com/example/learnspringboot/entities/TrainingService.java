package com.example.learnspringboot.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingService {

    private Cohert cohert;

    // will not need autowire if constructor injection is used
    // private final Cohert cohert;
    // public TrainingService(Cohert cohert) {
    // this.cohert = cohert;
    // }

    @Autowired
    public void setCohert(Cohert cohert) {
        this.cohert = cohert;
    }

    public Cohert getCohert() {
        return cohert;
    }

    public void showDetails() {
        this.cohert.displayType();
    }
}
