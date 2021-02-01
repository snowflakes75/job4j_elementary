package ru.job4j.condition;

/**
 * Класс срванение двух чисел
 */
public class IfElseReturn {
    /**
     *
     * @param first - первое число
     * @param second - второе число
     * @return true если 1 число больше 2
     */
    public static boolean greatThen(int first, int second) {
        return first > second;
    }

    public static void main(String[] args) {
        boolean result = greatThen(10, 2);
        System.out.println(result);
    }
}
