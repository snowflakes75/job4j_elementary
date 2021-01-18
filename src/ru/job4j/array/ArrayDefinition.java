package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Size of short[] " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Size of String[] " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Size of float[] " + prices.length);

        String[] names = new String[4];
        names[0] = "Bob";
        names[1] = "Alice";
        names[2] = "Jhon";
        names[3] = "Ricardo";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
