package ru.job4j.array;

/**
 * Класс для проверки выиграных комбинаций
 */
public class MatrixCheck {
    /**
     * Проверяем, что на строке не все X
     * @param board - доска, передаваемая ввиде 2х мерного массива символов
     * @param row - строка, которую проверяем
     * @return если в строке все элементы X то выводим true
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяем на однородность столбец
     * @param board - доска, передаваемая ввиде 2х мерного массива символов
     * @param column  - столбец, которую проверяем
     * @return если в столбце все элементы X то выводим true
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяем на однородность диагональ
     * @param board - доска, передаваемая ввиде 2х мерного массива символов
     * @return если на диагонали все элементы X то выводим true
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Проверка условия победы
     * @param board - доска, передаваемая ввиде 2х мерного массива символов
     * @return если условие победы выполнились, то true
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] diagonalBoard = extractDiagonal(board);
        for (int i = 0; i < diagonalBoard.length; i++) {
            if (diagonalBoard[i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
