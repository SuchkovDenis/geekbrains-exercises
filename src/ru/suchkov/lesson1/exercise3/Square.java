package ru.suchkov.lesson1.exercise3;

public class Square extends Figure{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    protected void computePerimeter() {
        perimeter = 4*a;
    }

    @Override
    protected void computeSquare() {
        square = a*a;
    }
}
