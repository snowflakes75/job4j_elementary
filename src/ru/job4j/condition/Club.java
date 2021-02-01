package ru.job4j.condition;

/**
 * Проверка входа в клуб
 */
public class Club {
    /**
     *
     * @param hasMoney - наличие денег
     * @param beFriend - свободные друзья
     */
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
