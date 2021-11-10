package ru.java_core.lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneNumbers {
    HashMap<String, ArrayList<String>> employees = new HashMap<>();

    public void add() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String answer = sc.nextLine();
            if (answer.equals("Добавить")) {
                String employee = sc.nextLine();
                String phone = sc.nextLine();

            if (employees.get(employee) == null) {
                ArrayList<String> phones = new ArrayList<>();
                phones.add(phone);
                employees.put(employee, phones);
            }
            else {
                employees.get(employee).add(phone);
            }
            }
            else if (answer.equals("Показать")) {
                String employee = sc.nextLine();
                System.out.println(employees.get(employee));
            }
            else if (answer.equals("Выход")) {
                break;
            }
        }
    }
}
