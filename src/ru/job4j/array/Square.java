package ru.job4j.array;

/**
 * Класс чтобы вычеслить значение квадра элемента
 */
public class Square {
    /**
     *
     * @param bound - кол-во значений для которых будет вычисляться их квадрат
     * @return
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
