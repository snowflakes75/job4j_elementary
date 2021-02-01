package ru.job4j.condition;

/**
 * Класс реализации глупого робота,
 * который отвечает на вопросы
 */
public class DummyBot {
    /**
     *
     * @param question - вопрос к боту
     * @return вернет ответ на вопрос
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}
