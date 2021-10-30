package ru.java_core.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main.fruitCollection();
        PhoneNumbers phoneNumbers = new PhoneNumbers();
        phoneNumbers.add();

    }

    public static void fruitCollection() {
        String[] col = {"Яблоко", "Тыква", "Огурец", "Тыква", "Апельсин", "Вишня", "Яблоко", "Ананас", "Вишня", "Виноград", "Персик", "Дыня"};

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(col));

        HashMap<String, Integer> hm = new HashMap<>();
        for (String item: arrayList) {
            if (hm.containsKey(item)) {
                hm.put(item, hm.get(item) + 1);
            } else {
                hm.put(item, 1);
            }
        }
        System.out.println(hm.keySet());
        for (Map.Entry<String, Integer> entry: hm.entrySet()) {
            System.out.printf("%s встречается %s раз\n", entry.getKey(), entry.getValue());
        }
    }
}
