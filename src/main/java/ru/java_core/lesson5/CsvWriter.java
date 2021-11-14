package ru.java_core.lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CsvWriter {
    public static <Z extends CSVContent> void writeTo(String filePath, Z data) throws IOException {
        FileWriter file = new FileWriter(filePath);
        file.write(data.parseCsv());
        file.close();
    }

    public static AppData readFrom(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        AppData newAppData = new AppData();
        if (sc.hasNextLine()) {
            String head = sc.nextLine();
            newAppData.setHeader(head.split(";"));
        }
        while (sc.hasNextLine()) {
            int[] line = Arrays.stream(sc.nextLine().split(";")).mapToInt(Integer::parseInt).toArray();
            newAppData.addData(line);
        }
        sc.close();

        return newAppData;
    }
}
