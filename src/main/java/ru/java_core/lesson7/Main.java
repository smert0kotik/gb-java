package ru.java_core.lesson7;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String cityCode = RequestHandler.detectCityId("Moscow");
        System.out.println(cityCode);
        String forecast = RequestHandler.getForecast(cityCode);
        System.out.println(forecast);
        String dailyForecast = RequestHandler.getDailyForecast(cityCode);
        System.out.println(dailyForecast);
    }
}
