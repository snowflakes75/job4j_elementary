package ru.job4j.array;

/**
 * Класс для слияния двух отсортированных массивов
 */
public class Merge {
    /**
     * @param left - 1 массив для слияния
     * @param right - 2 массив
     * @return вернет слитый отсортированный массив
     */
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0;
        while ((i + j) < rsl.length) {
            if (i < left.length && left[i] < right[j]) {
                rsl[i + j] = left[i];
                i++;
            } else {
                rsl[i + j] = right[j];
                j++;
            }
        }
        return rsl;
    }
}
