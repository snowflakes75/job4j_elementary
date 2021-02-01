package ru.job4j.condition;

/**
 * Класс для поиска максимального числа
 */
public class Max {
    /**
     *
     * @param left - 1 число
     * @param right - 2 число
     * @return вернет максимальное число
     */
    public static int max(int left, int right) {
        return left > right ? left : right;
    }
}
