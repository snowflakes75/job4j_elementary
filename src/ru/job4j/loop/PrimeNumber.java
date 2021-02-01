package ru.job4j.loop;

/**
 * Подсчет простых чисел
 */
public class PrimeNumber {
    /**
     * Подсчет простых чисел
     * @param finish - последние число
     * @return сумма кол-во простых чисел в диапозоне
     */
    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
