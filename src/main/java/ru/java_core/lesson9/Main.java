package ru.java_core.lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Arkadiy", "web-design");
    Student student2 = new Student("Vasiliy", "algorithms");
    Student student3 = new Student("Anna", "Java");
    Student student4 = new Student("Nikita", "algorithms");
    Student student5 = new Student("Ekaterina", "web-design");
    Student student6 = new Student("Sergey", "data science");

    student1.course.add("algorithms");
    student1.course.add("Java");
    student1.course.add("data science");
    student2.course.add("data science");
    student2.course.add("Java");
    student4.course.add("web-design");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        Set<String> uniqCourses = students.stream().flatMap(x -> x.course.stream()).collect(Collectors.toSet());

        System.out.println(uniqCourses);

        List<Student> mostRecent = students
                .stream()
                .sorted((x, y) -> Integer.compare(y.course.size(), x.course.size()))
                .limit(3)
                .toList();

        System.out.println(mostRecent);

        Function<String, List<String>> applicableTo = d -> students
                .stream()
                .filter(x -> x.course.contains(d))
                .map(x -> x.name)
                .toList();

        System.out.println(applicableTo.apply("algorithms"));
    }
}
