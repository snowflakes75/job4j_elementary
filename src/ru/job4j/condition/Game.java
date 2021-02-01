package ru.job4j.condition;

/**
 * Класс для запуска игр
 */
public class Game {
    /**
     * Запуск игры
     * @param name - имя игры
     */
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
