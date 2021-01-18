package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Size of short[] " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Size of String[] " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Size of float[] " + prices.length);
    }
}
