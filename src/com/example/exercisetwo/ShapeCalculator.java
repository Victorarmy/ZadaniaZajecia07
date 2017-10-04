package com.example.exercisetwo;

public class ShapeCalculator {

    public static double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * Math.pow((circle.getDiameter() / 2), 2);
        } else {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getSideOne() * rectangle.getSideTwo();
        }
    }

    public static double calculatePerimeter(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return 2 * Math.PI * (circle.getDiameter()/2);
        } else {
            Rectangle rectangle = (Rectangle) shape;
            return 2 * rectangle.getSideTwo() + 2 * rectangle.getSideOne();
        }
    }
}
