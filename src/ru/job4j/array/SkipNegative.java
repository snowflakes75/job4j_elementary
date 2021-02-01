package ru.job4j.array;

/**
 * Класс для того, чтобы массив
 * становился с 0 элементами вместо отрицательных
 */
public class SkipNegative {
    /**
     *
     * @param array - исходный массив
     * @return вернет массив без отрицательных значений
     */
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
