package ru.java_core.lesson8;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        DBHandler dbHandler = new DBHandler();
        Main.getMoscowDailyForecastAndSaveToDB(dbHandler);
    }

    public static void getMoscowDailyForecastAndSaveToDB(DBHandler db) throws IOException, SQLException {
        String cityCode = RequestHandlerDaily.detectCityId("Moscow");
        DayTemp dayTemp = RequestHandlerDaily.getDailyForecast(cityCode);
        db.addDailyForecast(dayTemp);
        db.selectForecast();
    }
}
