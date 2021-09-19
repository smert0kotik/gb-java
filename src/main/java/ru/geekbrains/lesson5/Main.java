package ru.geekbrains.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Staff[] list = new Staff[5];
        list[0] = new Staff("Пушкин Александр", 37, "product owner", 10000, "pushkin@mail.ru", 1234567890);
        list[1] = new Staff("Салтыков Евграф", 44, "iOS разработчик", 20000, "saltykov@mail.ru", 234156678);
        list[2] = new Staff("Щедрин Михаил", 28, "back-end разработчик", 30000, "pushkin@mail.ru", 567432789);
        list[3] = new Staff("Мамин Наркис", 32, "front-end разработчик", 40000, "pushkin@mail.ru", 789564733);
        list[4] = new Staff("Сибиряк Дмитрий", 45, "системный архитектор", 50000, "pushkin@mail.ru", 564383838);

        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() > 40) {
                list[i].print();
            }
        }
    }
}
