package ru.job4j.array;

/**
 * Класс для сравнения двух элементов массива
 * Начальный и последний
 */
public class EqLast {
    /**
     *
     * @param left - 1 элемент
     * @param right - последний элемент
     * @return true, если они совпадают
     */
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}
