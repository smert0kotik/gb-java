package ru.geekbrains.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Пончик", 150);
        Cat cat2 = new Cat("Гусь", 60);
        Plate plate = new Plate(200);

        cat1.eat(plate);
        cat2.eat(plate);
        plate.info();

        Cat[] cats = {
                new Cat("Толстый", 150),
                new Cat("Бублик", 60),
                new Cat("Пицца", 45),
                new Cat("Мышь", 15),
                new Cat("Шарик", 50),
        };

        Plate bigPlate = new Plate(350);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bigPlate);
        }
    }
}
