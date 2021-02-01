package ru.job4j.condition;

/**
 * Проверка существование треугольника
 */
public class Triangle {
    /**
     * Стороны треугольника
     * @param ab
     * @param ac
     * @param bc
     * @return true если треугольник существует с заданными сторонами
     */
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }
}
