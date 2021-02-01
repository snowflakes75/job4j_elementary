package ru.job4j.condition;

/**
 * Проверка на совпадение 2х точек
 */
public class PointEq {
    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return true если точки совпали
     */
    public static boolean eq(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }

    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
    }
}
