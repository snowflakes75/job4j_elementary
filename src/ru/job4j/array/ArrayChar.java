package ru.job4j.array;

/**
 * Класс для проверки строки на совпадения начало строки
 */
public class ArrayChar {
    /**
     * Метод сравнения начала двух строк
     * @param word - первая строка
     * @param pref - вторая строка
     * @return булевое значение. вернет true, если строки совподают
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
