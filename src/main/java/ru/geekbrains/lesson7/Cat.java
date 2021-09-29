package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean CatIsFull = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate plate) {
        boolean wasCatEat = plate.decreaseFood(appetite);
        CatIsFull = wasCatEat;
        if(wasCatEat) {
            System.out.println(name + " сытый");
        }  else {
            System.out.println(name + " голодный");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isCatIsFull() {
        return CatIsFull;
    }

    public void setCatIsFull(boolean catIsFull) {
        CatIsFull = catIsFull;
    }
}

