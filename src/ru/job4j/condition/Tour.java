package ru.job4j.condition;

/**
 * Класс предоставление тура
 */
public class Tour {
    /**
     * Метод для офера тура
     * @param passport - наличие паспорта
     */
    public static void offer(boolean passport) {
        System.out.println("A client has foreign passport : " + passport);
        if (passport) {
            System.out.println("Tours aboard.");
        } else {
            System.out.println("Tours in Russia.");
        }
    }

    public static void main(String[] args) {
        Tour.offer(true);
        Tour.offer(false);
    }
}
