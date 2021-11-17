package ru.java_core.lesson9;

import java.util.*;

public class Student {
    String name;
    ArrayList<String> course = new ArrayList<>();


    public Student(String name, String course) {
        this.name = name;
        this.course.add(course);
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, course);
    }
}
