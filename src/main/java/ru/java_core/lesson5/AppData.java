package ru.java_core.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class AppData extends CSVContent {
    private String[] header;
    private final ArrayList<int[]> data = new ArrayList<>();

    public void setHeader(String[] header) {
        this.header = header;
    }

    public String[] getHeader() {
        return header;
    }

    public void addData(int[] nextData) {
        data.add(nextData);
    }

    public ArrayList<int[]> getData() {
        return data;
    }

    public String parseCsv() {
        String csv = String.join(";", header) + "\n";
        for(int[] line: data) {
            String[] csvValues = Arrays.stream(line).mapToObj(Integer::toString).toArray(String[]::new);
            String csvLine = String.join(",", String.join(";", csvValues)) + "\n";
            csv = csv.concat(csvLine);
        }
        return csv;
    }
}
