package ru.java_core.lesson8;

import org.sqlite.JDBC;

import java.sql.*;

public class DBHandler {
    public final String PATH_DB = "jdbc:sqlite:C:\\Users\\Я\\IdeaProjects\\lesson1\\src\\main\\resources\\forecast.db";
    Connection connection;

    public DBHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        connection = DriverManager.getConnection(PATH_DB);
    }

    public void addDailyForecast(DayTemp dayTemp) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO DailyForecast(\"date\", \"min_temp\", \"max_temp\") VALUES(?, ?, ?)"
        )) {
            statement.setObject(1, dayTemp.date);
            statement.setObject(2, dayTemp.minTemp);
            statement.setObject(3, dayTemp.maxTemp);
            statement.execute();
        }   catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void selectForecast() throws SQLException {
        try (Statement statement = connection.createStatement()) {
            ResultSet items = statement.executeQuery("SELECT * FROM DailyForecast");
            while (items.next()) {
                DayTemp d = new DayTemp(
                        items.getString("date"),
                        items.getDouble("min_temp"),
                        items.getDouble("max_temp")
                );
                System.out.println(d);
            }
        }   catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

}
