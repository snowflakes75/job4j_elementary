package ru.job4j.loop;

/**
 * Рассчет физической подготовки
 */
public class Fitness {
    /**
     * Вычисление интенсивности тренировки
     * @param ivan - вес который жмет Иван
     * @param nik - вес который жмет Ник
     * @return сколько месяцев надо чтобы Ник догнал Ивана
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
