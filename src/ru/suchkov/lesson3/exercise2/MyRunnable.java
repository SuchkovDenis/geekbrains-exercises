package ru.suchkov.lesson3.exercise2;

public class MyRunnable implements Runnable{
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + " : " + counter.getCount());
        }
    }
}
