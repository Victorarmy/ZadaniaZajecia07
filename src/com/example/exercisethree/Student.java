package com.example.exercisethree;

import java.util.Arrays;

public class Student extends Human{
    private String className;

    public Student(String firstName, String lastName, String className) {
        super(firstName, lastName);
        this.className = className;
    }

    @Override
    public String toString() {
        return super.toString() + " class: " + className;
    }
}
