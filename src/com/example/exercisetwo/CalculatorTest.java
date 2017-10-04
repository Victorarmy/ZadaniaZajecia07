package com.example.exercisetwo;

public class CalculatorTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(20);
        Rectangle rectangle2 = new Rectangle(4, 12);
        Circle circle2 = new Circle(10);

        Shape[] shapes = {rectangle, circle, circle2, rectangle2};

        for (Shape shape : shapes) {
            shape.show();
        }
    }
}