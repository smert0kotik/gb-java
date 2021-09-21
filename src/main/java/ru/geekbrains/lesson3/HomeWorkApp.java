package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp.swapNumbers();
        HomeWorkApp.createArr100Items();
        HomeWorkApp.ArrMultiplicate();
        HomeWorkApp.createMatrix5x5();
        int[] result = HomeWorkApp.createFilledArray(10, 100);
        System.out.println(Arrays.toString(result));
        HomeWorkApp.MinMaxFind();
        System.out.println(
                HomeWorkApp.checkBalance(new int[]{1, 2, 3, 4, 2, 8})
        );
        int[] arr = {1, 2, 3, 4};
        HomeWorkApp.shift(arr, -2);
        System.out.println(Arrays.toString(arr));

    }
    public static void swapNumbers() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void createArr100Items() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void ArrMultiplicate() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void createMatrix5x5() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - 1 - i] = 1;
            System.out.println(Arrays.toString(table[i]));
        }
    }
    public static int[] createFilledArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;

    }
    public static void MinMaxFind() {
        int[] arr = {68, 12, 31, 7, 890, 44, 567, 77, 123, 25};
        int minVal = arr[0];
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            minVal = Math.min(minVal, arr[i]);
            maxVal = Math.max(maxVal, arr[i]);
        }
        System.out.println(minVal);
        System.out.println(maxVal);
    }
    public static boolean checkBalance(int[] arr) {
        int left = 0;
        int right = 0;
        for (int i: arr) {
            right = right + i;
        }

        int i = 0;
        while (left != right && i < arr.length) {
            right = right - arr[i];
            left = left + arr[i];
            i++;
        }

        return left == right;
    }
    public static void shift(int[] arr, int n) {
        int x = Math.abs(n % arr.length);
        int y = 0;
        if (n > 0) {
            while (x != 0) {
                int t = arr.length - x;
                int swap = arr[t];
                arr[t] = arr[y];
                arr[y] = swap;
                x = x - 1;
                y = y + 1;
            }

        } else {
            while (x != 0) {
                int t = x - 1;
                int swap = arr[t];
                arr[t] = arr[arr.length - y - 1];
                arr[arr.length - y - 1] = swap;
                x = x - 1;
                y = y + 1;
            }

        }
    }
}
