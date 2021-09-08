package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp.printThreeWords();
        HomeWorkApp.checkSumSign();
        HomeWorkApp.printColor();
        HomeWorkApp.compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\n" +
                           "Banana\n" +
                           "Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = -20;
//        int sum = a + b;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 104;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 166;
        int b = 25;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }
}