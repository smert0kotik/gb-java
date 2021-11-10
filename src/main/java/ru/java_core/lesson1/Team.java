package ru.java_core.lesson1;

import java.util.ArrayList;

public class Team {
    private final String name;
    private final Player[] players;
    private int finishedCourses = 0;

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;

    }

    public void showResults() {
        ArrayList<String> teamNames = new ArrayList<>();
        for (Player player: players) {
            teamNames.add(player.getName());
        }
        System.out.printf("Команда %s в составе %s завершила %s дистанций \n", name, teamNames, finishedCourses);

    }

    public void getTeamInfo() {
        for (Player player: players) {
            System.out.println(player);
        }
    }

    public void setFinishedCourses() {
        finishedCourses++;
    }
}
