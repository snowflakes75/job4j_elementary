package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(21, 1, 2);
        assertThat(result, is(21));
    }

    @Test
    public void whenAllMax() {
        int result = MultiMax.max(21, 21, 21);
        assertThat(result, is(21));
    }

    @Test
    public void whenFirst100Second100Third1Max100() {
        int result = MultiMax.max(100, 100, 1);
        assertThat(result, is(100));
    }
}