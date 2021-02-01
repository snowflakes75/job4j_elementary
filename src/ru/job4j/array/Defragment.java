package ru.job4j.array;

/**
 *
 */
public class Defragment {
    /**
     *
     * @param array - массив, который необходимо "сжать"
     * @return вернет сжатый массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
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

    /**
     *
     * @param arr - массив для сжатия
     * @param nullIndex - индекс для null значения
     * @param notNullIndex - индекс для не нулевого массива
     */
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
