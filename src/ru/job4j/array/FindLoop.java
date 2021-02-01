package ru.job4j.array;

/**
 * Класс для поиска индекса
 */
public class FindLoop {
    /**
     * Поиск на протяжении всего массива
     * @param data - массив для поиска
     * @param el - какой элемент нужно найти
     * @return вернет индекс найденного элемента или -1, если его нет
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Поиск на протяжении какого-то диапозона
     * @param data - массив для поиска элемента
     * @param el - элемент, который надо найти элемент
     * @param start - начала диапозона
     * @param finish - конец диапозона
     * @return вернет индекс или -1, если не найден элемент
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
