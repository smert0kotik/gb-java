package ru.java_core.lesson2;

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Размер массива не соответствует необходимому значению");

    }
}
