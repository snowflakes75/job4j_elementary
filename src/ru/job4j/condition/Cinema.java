package ru.job4j.condition;

/**
 * Класс для проверки доступа к фильму
 */
public class Cinema {
    /**
     * Допуск по возросту
     * @param age - возвраст
     */
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    /**
     * Допуск по разрешению родителей и наличие денег
     * @param allowByParent - разрешение родителей
     * @param hasMoney - наличие денег
     */
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
        System.out.println();
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
