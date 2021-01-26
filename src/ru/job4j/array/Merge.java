package ru.job4j.array;

public class Merge {
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
