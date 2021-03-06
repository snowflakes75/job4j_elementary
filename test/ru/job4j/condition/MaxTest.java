package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirst2Second1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenBothNumber2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when4NumberAndSecondMaxThenSecond() {
        int result = Max.max(1, 5, 3, 4);
        assertThat(result, is(5));
    }

    @Test
    public void when3NumberAndSecondMaxThenSecond() {
        int result = Max.max(1, 5, 33);
        assertThat(result, is(33));
    }
}