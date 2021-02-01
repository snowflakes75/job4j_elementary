package ru.job4j.array;

/**
 * Класс чтобы перевернуть массив
 */
public class Turn {
    /**
     *
     * @param array - исходный массив
     * @return вернет реверсную версию массива
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
