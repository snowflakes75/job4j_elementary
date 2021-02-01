package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс реализующий работу по выдоче монет из автомата
 */
public class Machine {
    /**
     * Подсчет сдачи
     * @param money - внесенная купюра
     * @param price - цена товара
     * @return массив состоящий из сдачи
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1}; // номинал монет
        int[] rsl = new int[100];
        int size = 0;
        int mustReturn = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (mustReturn >= coins[i]) {
                mustReturn = mustReturn - coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
