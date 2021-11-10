package ru.java_core.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (String[][] arr: new String[][][]{Main.TestArrayOK, Main.TestArrayWrongSize, Main.TestArrayWrongData}) {
            try {
                int[][] result = Main.parseOrDie(arr);
                for (int[] i :result) {
                    System.out.println(Arrays.toString(i));
                }
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static final int len = 4;

    public static int[][] parseOrDie(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        boolean isLengthValid = true;
        if (myArray.length != Main.len) {
            isLengthValid = false;
        } else {
            for (String[] i: myArray) {
                if (i.length != Main.len) {
                    isLengthValid = false;
                    break;
                }
            }
        }

        if (!isLengthValid) {
            throw new MyArraySizeException();
        }

        int[][] result = new int[Main.len][Main.len];
        for (int row = 0; row < Main.len; row++) {
            for (int item = 0; item < Main.len; item++) {
                String point = myArray[row][item];
                try {
                    result[row][item] = Integer.parseInt(point);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Ошибка преобразования в число в строке %s, колонке %s", row, item));
                }
            }
        }

        return result;
    }

    private static String[][] TestArrayOK = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
    };

    private static String[][] TestArrayWrongSize = {
            {"1", "2", "3"},
            {"1", "2", "3"},
            {"1", "2", "3"}
    };

    private static String[][] TestArrayWrongData = {
            {"1", "2", "3", "4"},
            {"1", "2", "sfsdfsdf", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
    };
}


