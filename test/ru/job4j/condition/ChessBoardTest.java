package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {
    @Test
    public void wayTIs6() {
        int way = ChessBoard.wayT(0, 0, 0, 6);
        assertThat(way, is(6));
    }

    @Test
    public void wayTIs5() {
        int way = ChessBoard.wayT(0, 0, 5, 0);
        assertThat(way, is(5));
    }

    @Test
    public void wayTIs0() {
        int way = ChessBoard.wayT(0, 0, 5, 6);
        assertThat(way, is(0));
    }

    //4.3.6. Math.abs
    @Test
    public void wayIs5() {
        int way = ChessBoard.way(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(7, 0, 0, 7);
        assertThat(way, is(7));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(2, 6, 4, 1);
        assertThat(way, is(0));
    }
}