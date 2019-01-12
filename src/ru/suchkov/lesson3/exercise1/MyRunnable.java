package ru.suchkov.lesson3.exercise1;

public class MyRunnable implements Runnable{
    private String text;

    public MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Printer.print(text);
            // нить засыпает и передает управление другой нити
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}