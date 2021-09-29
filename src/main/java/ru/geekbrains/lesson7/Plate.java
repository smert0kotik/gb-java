package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodToEat) {

        if (food >= foodToEat) {
            food -= foodToEat;
            System.out.println("Корма достаточно");
            return true;

        } else {
            System.out.println("Корма недостаточно, кот смотрит на вас осуждающе");
            return false;
        }
    }

    public void info() {
        System.out.println("Корма осталось: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int food) {
        this.food += food;
        System.out.printf("Теперь корма в тарелке %s%n", this.food);
    }
}
