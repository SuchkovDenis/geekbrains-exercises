package ru.suchkov.lesson3.exercise2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private long count;
    private Lock lock;

    public long getCount() {
        return count;
    }

    public Counter() {
        this.count = 0;
        lock = new ReentrantLock();
    }

    public void increment() {
        lock.lock();
        count++;
        lock.unlock();
    }
}
