package ru.job4j.calculator;

/**
 * Класс для расчета идеального веса человека
 */
public class Fit {
    /**
     * Рассчет идеального веса мужчины
     * @param height - рост
     * @return вернет вес для заданного роста
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Рассчет идеального веса женщины
     * @param height - рост
     * @return вернет вес для заданного роста
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
