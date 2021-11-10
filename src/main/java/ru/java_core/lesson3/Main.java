package ru.java_core.lesson3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        Box<Orange> box2 = new Box<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        box2.addFruitToBox(orange1);
        box2.addFruitToBox(orange2);

        box.addFruitToBox(apple1);
        box.addFruitToBox(apple2);
        box.addFruitToBox(apple3);
        box.addFruitToBox(apple4);

        System.out.println(box.getWeightOfBox());
        System.out.println(box2.getWeightOfBox());

        System.out.println(box.compareWeight(box2));

        box.swapWith(box2);
        System.out.println(box.getWeightOfBox());
        System.out.println(box2.getWeightOfBox());
    }
}
