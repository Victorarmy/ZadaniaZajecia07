package com.example.exercisethree;

public class School {
    public static void main(String[] args) {
        Human teacher = new Teacher("Jan", "Kowalski", 1300, "3B, 1A, 2A");
        Human student = new Student("Kamil", "Kowalski", "1C");

        System.out.println(teacher);
        System.out.println(student);
    }
}
