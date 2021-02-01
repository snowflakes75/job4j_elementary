package ru.job4j.condition;

/**
 * Класс для вычесления площади треугольника
 */
public class TrgArea {
    /**
     *
     * @param a
     * @param b
     * @param c
     * @return вернет площадь треугольника
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
