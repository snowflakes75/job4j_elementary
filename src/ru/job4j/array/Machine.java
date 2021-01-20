package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1}; // номинал монет
        int[] rsl = new int[100];
        int size = 0;

        int mustReturn = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (mustReturn % coins[i] > 0) {
                mustReturn = mustReturn - coins[i];
                size++;
             }
            rsl[i] = coins[i];
        }

        return Arrays.copyOf(rsl, size);
    }
}
