package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static double rubleToDollar(int value) {
        return (double) value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + new DecimalFormat("#.##").format(dollar) + " dollars");

        System.out.println("Test");
        int in  = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        String outDollar = new DecimalFormat("#.##").format(Converter.rubleToDollar(in));
        String expectedDollar = String.valueOf(2.33).replace(".", ",");
        passed = expectedDollar.equals(outDollar);
        System.out.println("140 rubles are 2,33. Test result : " + passed);
    }
}
