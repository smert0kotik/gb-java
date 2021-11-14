package ru.java_core.lesson8;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RequestHandlerDaily {
    final static OkHttpClient okHttpClient = new OkHttpClient();
    final static ObjectMapper objectMapper = new ObjectMapper();

    public static String detectCityId(String cityName) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", "nTrqAbmdzCQslhqDmvNRHm9crPZ7XTum")
                .addQueryParameter("q", cityName)
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String json = response.body().string();
        String city = objectMapper.readTree(json).get(0).at("/LocalizedName").asText();
        System.out.println(city);
        String code = objectMapper.readTree(json).get(0).at("/Key").asText();

        return code;

    }

    public static DayTemp getDailyForecast(String cityName) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("1day")
                .addPathSegment(cityName)
                .addQueryParameter("apikey", "nTrqAbmdzCQslhqDmvNRHm9crPZ7XTum")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String json = response.body().string();
        String date = objectMapper.readTree(json).at("/DailyForecasts").get(0).at("/Date").asText();
        Double minTemp = objectMapper.readTree(json).at("/DailyForecasts").get(0).at("/Temperature").at("/Minimum").at("/Value").asDouble();
        Double maxTemp = objectMapper.readTree(json).at("/DailyForecasts").get(0).at("/Temperature").at("/Maximum").at("/Value").asDouble();


        return new DayTemp(date, minTemp, maxTemp);

    }
}
