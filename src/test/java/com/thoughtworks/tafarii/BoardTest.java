package com.thoughtworks.tafarii;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tafarii on 9/29/16.
 */
public class BoardTest {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDrawGridWhenPrintingBoard() throws Exception {
        board.printBoard();
        verify(printStream).println("1|2|3" + '\n' + "4|5|6" + '\n' + "7|8|9\n");
    }

    //Not sure if this test is working correctly
    @Test
    public void shouldRedrawBoardWithXInThatLocation() throws Exception {
        String symbol = "X";
        String mark = "4";
        board.redraw(symbol, mark);


    }
}
