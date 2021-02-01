package ru.job4j.condition;

/**
 * Класс для проверки свойств числа
 */
public class LogicNot {
    /**
     * Провека на четность
     * @param num - число
     * @return true если число четное
     */
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Проверка на позитивность
     * @param num - число
     * @return true если число положительное
     */
    public boolean isPositive(int num) {
        return num > 0;
    }

    /**
     * Проверка на нечетность
     * @param num - число
     * @return true если число нечетное
     */
    public boolean notEven(int num) {
        return !isEven(num);
    }

    /**
     * Проверка на отрицательность
     * @param num - число
     * @return true если число отрицательное
     */
    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    /**
     * Проверка нечетность и положительное
     * @param num - число
     * @return true если нечетное и положительное число
     */
    public boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    /**
     * Проверка на четность и отрицательность
     * @param num - число
     * @return true если четное и отрицательное
     */
    public boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }
}
