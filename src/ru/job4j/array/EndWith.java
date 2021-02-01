package ru.job4j.array;

/**
 * Класс для проверки строки на совпадения конца строки строки
 */
public class EndWith {
    /**
     *
     * @param word - буквы для сравнения 1 слова
     * @param post - буквы для сравнения 2 слова
     * @return вернет true, если строки совподают
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
