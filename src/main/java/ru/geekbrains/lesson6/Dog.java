package ru.geekbrains.lesson6;

public class Dog extends Animal {
    static int maxRun = 500;
    static int maxSwim = 10;

    public Dog(String name) {
        super(name, Dog.maxRun, Dog.maxSwim);
        Dog.counter++;
    }

    static int counter = 0;
}
