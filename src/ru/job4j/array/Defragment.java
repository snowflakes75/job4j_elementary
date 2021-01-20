package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        swap(array, index, i);
                        break;
                    }
                }

            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void swap(String[] arr, int nullIndex, int notNullIndex) {
        String temp = arr[nullIndex];
        arr[nullIndex] = arr[notNullIndex];
        arr[notNullIndex] = temp;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
