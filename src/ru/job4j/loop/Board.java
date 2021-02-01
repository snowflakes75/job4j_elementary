package ru.job4j.loop;

/**
 * Класс для отображение шахматной доски
 */
public class Board {
    /**
     *
     * @param width - ширина поля
     * @param height - высота поля
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
