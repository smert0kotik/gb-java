package ru.java_core.lesson1;

public class Player {
    private final String name;
    private final int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("%s, %s", name, age);
    }

    public String getName() {
        return name;
    }
}
