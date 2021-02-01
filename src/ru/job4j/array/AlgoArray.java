package ru.job4j.array;

/**
 * Класс для сортировки массива
 *
 * @author snowflakes75
 * @version 1
 */
public class AlgoArray {
    /**
     * Сортировка массива методом пузырька
     *
     * @param arr - входной массив, который необходимо отсортировать
     */
    public static void bubbleSort(int[] arr) {
        int out, in;
        for (out = arr.length - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    int temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        AlgoArray.bubbleSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
