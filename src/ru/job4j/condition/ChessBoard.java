package ru.job4j.condition;

/**
 * Класс для просчета хода шахматных фигур
 */
public class ChessBoard {
    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static int wayT(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    /**
     * Метод хода слона
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }
}
