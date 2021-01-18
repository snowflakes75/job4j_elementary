package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = 0;
        if (first >= second && first >= third) {
            max = first;
        } else if (second >= third) {
            max = second;
        } else {
            max = third;
        }
        return max;
    }
}
