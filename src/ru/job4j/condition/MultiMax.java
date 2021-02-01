package ru.job4j.condition;

/**
 * Поиск максимального числа
 */
public class MultiMax {
    /**
     *
     * @param first - 1 число
     * @param second - 2 число
     * @param third - 3 число
     * @return вернет максимальное число
     */
    public static int max(int first, int second, int third) {
        int max = 0;
        if (first >= second && first >= third) {
            max = first;
        } else if (second >= third) {
            max = second;
        } else {
            max = third;
        }
        return max;
    }
}
