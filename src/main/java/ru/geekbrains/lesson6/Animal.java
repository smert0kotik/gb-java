package ru.geekbrains.lesson6;

public class Animal {
    static int counter = 0;
    protected final String name;
    protected final int maxRun;
    protected final int maxSwim;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        Animal.counter++;
    }

    public String getName() {
        return name;
    }

    public void run(int length) {
        if (maxRun == 0) {
            System.out.printf("%s не умеет бегать%n", name);
            return;
        }
        if (length > maxRun) {
            System.out.printf("%s столько не пробежит%n", name);
        } else {
            System.out.printf("%s пробежал %s метров%n", name, length);
        }

    }

    public void swim(int length) {
        if (maxSwim == 0) {
            System.out.printf("%s не умеет плавать%n", name);
            return;
        }
        if (length > maxSwim) {
            System.out.printf("%s столько не проплывет%n", name);
        } else {
            System.out.printf("%s проплыл %s метров%n", name, length);
        }
    }

}
