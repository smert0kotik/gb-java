package ru.geekbrains.lesson4;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static class MainClass {
        public static int SIZE = 3;
        public static final char SYMB_EMPTY = '•';
        public static final char SYMB_X = 'X';
        public static final char SYMB_O = 'O';
        public static char[][] field;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();
        public static void main(String[] args) {
            initField();
            printField();
            while (true) {
                humanMove();
                printField();
                if (WinCheck(SYMB_X)) {
                    System.out.println("Вы победили");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Ничья");
                    break;
                }
                pcMove();
                printField();
                if (WinCheck(SYMB_O)) {
                    System.out.println("Победил PC");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        public static void initField() {
            field = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    field[i][j] = SYMB_EMPTY;
                }
            }
        }

        public static void printField() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void humanMove() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y (через пробел)");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (isMoveValid(x, y)); // while(isCellValid(x, y) == false)
            field[y][x] = SYMB_X;
        }

        public static void pcMove() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (isMoveValid(x, y));
            System.out.println("PC ходил в точку " + (x + 1) + " " + (y + 1));
            field[y][x] = SYMB_O;
        }

        public static boolean isMoveValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
            return field[y][x] != SYMB_EMPTY;
        }

        public static boolean checkRowWin(char symb) {
            boolean result = false;
            String matcher = String.format("%s", symb).repeat(SIZE);
            for (char[] chars : field) {
                if (new String(chars).compareTo(matcher) == 0) {
                    result = true;
                    break;
                }
            }
            return result;
        }

        public static boolean checkColumnWin(char symb) {
            boolean result = false;
            String matcher = String.format("%s", symb).repeat(SIZE);
            for (int x = 0; x < field.length; x++) {
                char[] col = new char[field.length];
                for (int y = 0; y < field.length; y++) {
                    col[y] = field[y][x];
                }
                if (new String(col).compareTo(matcher) == 0) {
                    result = true;
                    break;
                }
            }
            return result;
        }

        public static boolean checkDiagonalWin(char symb) {
            String matcher = String.format("%s", symb).repeat(SIZE);
            char[] lrDiagonal = new char[field.length];
            for (int i = 0; i < field.length; i++) {
                lrDiagonal[i] = field[i][i];
            }
            if (new String(lrDiagonal).compareTo(matcher) == 0) {
               return true;
            }
            char[] rlDiagonal = new char[field.length];
            for (int y = 0; y < field.length; y++) {
                rlDiagonal[y] = field[y][field.length - y - 1];
            }
            return new String(rlDiagonal).compareTo(matcher) == 0;
        }

        public static boolean WinCheck(char symb) {
            return MainClass.checkRowWin(symb) || MainClass.checkColumnWin(symb) || MainClass.checkDiagonalWin(symb);
        }

        public static boolean isFieldFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (field[i][j] == SYMB_EMPTY) return false;
                }
            }
            return true;
        }
    }
}
