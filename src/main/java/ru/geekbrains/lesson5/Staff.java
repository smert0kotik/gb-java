package ru.geekbrains.lesson5;

public class Staff {
    private final String name;
    private final int age;
    private final String position;
    private final float salary;
    private final String email;
    private final int phone_number;

    public Staff(String name, int age, String position, float salary, String email, int phone_number) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s;", name, age, email, phone_number, position, salary);
    }
}


