package ru.suchkov.lesson1.exercise3;

public abstract class Figure {
    protected double perimeter;
    protected double square;

    protected abstract void computePerimeter();
    protected abstract void computeSquare();

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }
}
