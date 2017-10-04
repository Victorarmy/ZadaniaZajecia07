package com.example.exercisethree;

public class Teacher extends Human {
    private int salary;
    private String classes;

    public Teacher(String firstName, String lastName, int salary, String classes) {
        super(firstName, lastName);
        this.salary = salary;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return super.toString() + " salary: " + salary + " classes: " + classes;
    }
}
