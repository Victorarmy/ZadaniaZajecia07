package com.example.exercisetwo;

public class Rectangle extends Shape {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    @Override
    public void show() {
        System.out.println("Pole prostokąta o bokach " + this.sideOne + ", " + this.sideTwo + " wynosi " + ShapeCalculator.calculateArea(this));
        System.out.println("Obwód prostokąta o bokach " + this.sideOne + ", " + this.sideTwo + " wynosi " + ShapeCalculator.calculatePerimeter(this));
    }
}
