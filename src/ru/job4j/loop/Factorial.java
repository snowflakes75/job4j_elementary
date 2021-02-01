package ru.job4j.loop;

/**
 * Вичисление факториала
 */
public class Factorial {
    /**
     *
     * @param n - до какого числа считать
     * @return - факториал числа
     */
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
