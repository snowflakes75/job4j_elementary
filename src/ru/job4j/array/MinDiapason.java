package ru.job4j.array;

/**
 * Класс для поиска минимального значения в диапозоне
 */
public class MinDiapason {
    /**
     * @param array - массив, где происходит поиск мин значения
     * @param start - начальный индекс поиска
     * @param finish - конечное значение диапозона
     * @return вернет минимальное значение в диапазоне
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
