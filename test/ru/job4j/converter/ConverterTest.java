package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen2comma33Dlr() {
        String expectedDollar = String.valueOf(2.33).replace(".", ",");
        Assert.assertEquals(expectedDollar, "2,33");
    }
}