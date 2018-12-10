package ru.suchkov.lesson1.exercise2;

// интерфейсы Moveable и Stopable реализуются (implements) а не наследуются (extends)
public class Lorry extends Car implements Moveable, Stopable{

    // добавлена имплементация метода open
    @Override
    void open() {

    }

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }
}