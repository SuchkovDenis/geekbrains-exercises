package ru.suchkov.lesson1.exercise3;

public class Circle extends Figure{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    protected void computePerimeter() {
        perimeter = 2*Math.PI*radius;
    }

    @Override
    protected void computeSquare() {
        square = Math.PI*radius*radius;
    }
}
