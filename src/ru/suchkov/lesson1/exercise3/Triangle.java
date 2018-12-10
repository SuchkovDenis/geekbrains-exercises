package ru.suchkov.lesson1.exercise3;

public class Triangle extends Figure{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    protected void computePerimeter() {
        perimeter = a + b + c;
    }

    @Override
    protected void computeSquare() {
        computePerimeter();
        square = Math.sqrt(perimeter/2*(perimeter/2-a)*(perimeter/2-b)*(perimeter/2-c));
    }
}
