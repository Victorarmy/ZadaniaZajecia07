package com.example.exercisetwo;

public class Circle extends Shape {
    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void show() {
        System.out.println("Pole koła o pronienu " + this.diameter/2 + " wynosi " + ShapeCalculator.calculateArea(this));
        System.out.println("Obwód koła o pronienu " + this.diameter/2 + " wynosi " + ShapeCalculator.calculatePerimeter(this));
    }
}
