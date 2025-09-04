package com.example.learnspringboot.entities;

public class Student {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setting age...");
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public Student(int age) {
        this.age = age;
        System.out.println("A student has been created.");
    }

    public void writeExam() {
        System.out.println("A student is writing an exam.");
    }

    @Override
    public String toString() {
        return "Student [age=" + age + "]";
    }

}
