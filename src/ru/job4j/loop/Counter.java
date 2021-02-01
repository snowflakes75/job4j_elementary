package ru.job4j.loop;

import ru.job4j.condition.LogicNot;

/**
 * Суммирование разных чисел
 */
public class Counter {
    /**
     *
     * @param start
     * @param finish
     * @return сумма чисел
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Сумма четных чисел
     * @param start
     * @param finish
     * @return Сумма четных чисел
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        LogicNot lg = new LogicNot();
        for (int i = start; i <= finish; i++) {
            if (lg.isEven(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 0));
        System.out.println(sum(1, 3));
        System.out.println();
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
