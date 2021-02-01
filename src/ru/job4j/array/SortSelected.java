package ru.job4j.array;

/**
 * Сортировка выборкой
 */
public class SortSelected {
    /**
     * Метод для перестановки элементов в массиве
     * @param data - массив
     * @param index - индекс для перестановки
     * @param i - 2 индекс для перестановки
     */
    public static void  swap(int[] data, int index, int i) {
        int temp = data[index];
        data[index] = data[i];
        data[i] = temp;
    }

    /**
     * Метод для сортировки
     * @param data - массив для сортировки
     * @return отсортированный массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            swap(data, index, i);
        }
        return data;
    }
}
