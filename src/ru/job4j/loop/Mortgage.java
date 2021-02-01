package ru.job4j.loop;

/**
 * Вычисление ипотеки
 */
public class Mortgage {
    /**
     * @param amount выданная сумма
     * @param salary годовой доход
     * @param percent процентная ставка
     * @return кол-во лет для выплаты ипотеки
     */
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount >= 0) {
            amount += amount * (percent / 100);
            amount -= salary;
            year++;
        }
        return year;
    }
}
