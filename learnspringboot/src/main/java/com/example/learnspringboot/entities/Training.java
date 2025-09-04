package com.example.learnspringboot.entities;

public class Training {
    Cohert cohert;

    public Training(Cohert cohert) {
        this.cohert = cohert;
    }

    public void getType() {
        this.cohert.displayType();
    }
}
