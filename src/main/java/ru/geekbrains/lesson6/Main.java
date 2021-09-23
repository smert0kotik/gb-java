package ru.geekbrains.lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        dog.run(150);
        dog.swim(500);
        Cat cat = new Cat("Пушок");
        cat.run(10);
        cat.swim(5);

        System.out.println(Dog.counter);
        System.out.println(Cat.counter);
        System.out.println(Animal.counter);
    }
}
