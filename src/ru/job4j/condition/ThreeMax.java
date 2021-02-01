package ru.job4j.condition;

/**
 * Вернет максимальное число из 3х
 */
public class ThreeMax {
    /**
     *
     * @param first - 1 число
     * @param second - 2 число
     * @param third - 3 число
     * @return вернет максимальное число
     */
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}
