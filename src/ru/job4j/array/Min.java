package ru.job4j.array;

/**
 * Класс для поиска минимального значения
 */
public class Min {
    /**
     * @param array - массив, где происходит поиск минимального значения
     * @return - вернет минимальное значение в массиве
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
