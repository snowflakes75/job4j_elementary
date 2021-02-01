package ru.job4j.array;

/**
 * Класс проверяющий на моно заполнения массива
 */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean monoSign = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != monoSign) {
                result = false;
                break;
            }
        }
        return result;
    }
}
