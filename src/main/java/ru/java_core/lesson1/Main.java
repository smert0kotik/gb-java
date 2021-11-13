package ru.java_core.lesson1;

public class Main {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Василий", 24),
                new Player("Аркадий",27),
                new Player("Сергей", 19),
                new Player("Николай", 23),
        };

        Team team = new Team("Электрические жирафы", players);
        team.getTeamInfo();

        Course course = new Course(new String[]{"бег", "прыжки", "плавание"});

        course.doIt(team);
        team.showResults();
    }
}
