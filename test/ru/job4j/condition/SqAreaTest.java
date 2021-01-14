package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP25K2then34comma72() {
        double expected = 34.72;
        int p = 25;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K22then1comma03() {
        double expected = 1.03;
        int p = 10;
        int k = 22;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}