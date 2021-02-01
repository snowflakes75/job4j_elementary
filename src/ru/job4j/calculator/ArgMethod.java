package ru.job4j.calculator;

/**
 * Класс для приветствие людей
 */
public class ArgMethod {
    /**
     * Метод приветствует пользователя
     */
    public static void hello() {
        System.out.println("Hello User!");
    }

    /**
     * Метод приветствует конкретного человека
     * @param name - имя пользователя
     */
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    /**
     * Метод приветствует пользователя и выводит его возраст
     * @param name - имя пользователя
     * @param age - возвраст пользователя
     */
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ". Your age: " + age);
    }

    /**
     * Выводит возвраст
     * @param age - возвраст
     */
    public static void hello(int age) {
        System.out.println("Input age " + age);
    }

    /**
     * Выводит списком пользователей
     * @param name - массив имен пользователей
     */
    public static void hello(String... name) {
        int i = 0;
        System.out.print("Hello people!");
        while (i < name.length) {
            System.out.print(" " + name[i] + ";");
            i++;
        }
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }
}
