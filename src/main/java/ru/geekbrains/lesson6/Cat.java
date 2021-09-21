package ru.geekbrains.lesson6;

public class Cat extends Animal{
    static int maxRun = 200;
    static int maxSwim = 0;


    public Cat(String name) {
        super(name, Cat.maxRun, Cat.maxSwim);
        Cat.counter++;
    }
    static int counter = 0;
}
