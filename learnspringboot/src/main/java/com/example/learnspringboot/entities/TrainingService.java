package com.example.learnspringboot.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingService {

    private Cohert cohert;

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
