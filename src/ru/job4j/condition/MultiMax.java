package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = third;
        if (first > second && first > third) {
            max = first;
        } else if (second > first && second > third) {
            max = second;
        }
        return max;
    }
}
