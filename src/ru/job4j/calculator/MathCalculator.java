package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double total(double first, double second) {
        return sum(first, second) + multiply(first, second) + diff(first, second) + div(first, second);
    }

    public static double sumOfdiffAndDiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
