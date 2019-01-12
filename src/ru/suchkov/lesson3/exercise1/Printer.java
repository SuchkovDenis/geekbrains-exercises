package ru.suchkov.lesson3.exercise1;

public class Printer {
    // синхронизация идет по классу
    public static synchronized void print(String string) {
        System.out.println(string);
    }
}
