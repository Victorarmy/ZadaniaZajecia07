package com.example.exercisethree;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FirstName: " + firstName + " " +
                ", LastName: " + lastName;
    }
}
