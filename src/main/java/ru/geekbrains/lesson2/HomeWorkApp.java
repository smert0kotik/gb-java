package ru.geekbrains.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        boolean result = HomeWorkApp.space1020(1, 7);
        System.out.println(result);
        HomeWorkApp.IsSignedInteger(35);
        boolean IsNegative = HomeWorkApp.TrueIfItNegative(-12);
        System.out.println(IsNegative);
        HomeWorkApp.WordInTimes("Hello, world", 10);
        boolean Year = HomeWorkApp.IsLeapYear(2100);
        System.out.println(Year);
    }

    public static boolean space1020(int a, int b) {
        int result = a + b;
        return result >= 10 && result <= 20;
    }
    public static void IsSignedInteger(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {System.out.println("отрицательное");
        }
    }
    public static boolean TrueIfItNegative(int a) {
      if (a < 0) {
          return true;
      } else {
          return false;
      }
    }
    public static void WordInTimes(String word, int times) {
    for (int i = 0; i != times; i++) {
        System.out.println(word);
    }
    }
    public static boolean IsLeapYear(int year) {
        //if (year % 4 == 0) (year % 100 != 0) (year % 400 == 0)
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
