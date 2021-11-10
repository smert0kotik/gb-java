package ru.java_core.lesson5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        AppData app = new AppData();
        app.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        app.addData(new int[]{100,200,300});
        app.addData(new int[]{400,500,600});
        app.addData(new int[]{700,800,900});
//        CsvWriter.writeTo("./input.csv", app);

        AppData readedAppData = CsvWriter.readFrom("./input.csv");
        System.out.println(Arrays.toString(readedAppData.getHeader()));
        for (int[] line: readedAppData.getData()) {
            System.out.println(Arrays.toString(line));
        }
    }
}
