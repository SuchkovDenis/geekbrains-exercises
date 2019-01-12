package ru.suchkov.lesson3.exercise2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            new Thread(new MyRunnable(counter)).start();
        }
    }
}