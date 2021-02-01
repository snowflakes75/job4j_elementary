package ru.job4j.array;

/**
 * Класс выводящий таблицу умножения
 */
public class Matrix {
    /**
     * Генерирует таблицу умножения
     * @param size - размерной таблицы
     * @return - таблицу умножения
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
