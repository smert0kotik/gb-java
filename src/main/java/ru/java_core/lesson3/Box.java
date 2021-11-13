package ru.java_core.lesson3;
import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> fruit = new ArrayList<>();

    public void addFruitToBox(T t) {
        fruit.add(t);

    }

    public double getWeightOfBox() {
        if (fruit.size() > 0) {
            return fruit.get(0).getWeight() * fruit.size();
        }
        return 0;
    }


    public <M extends Fruit> boolean compareWeight(Box<M> cmp) {
        return getWeightOfBox() == cmp.getWeightOfBox();
    }

    public void swapWith(Box<?> box) {
        Box<T> o = ((Box<T>) box);
        o.fruit = (ArrayList<T>) fruit.clone();
        fruit.clear();
    }
}
