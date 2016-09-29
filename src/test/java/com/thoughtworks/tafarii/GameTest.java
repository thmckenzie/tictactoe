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
public class GameTest {
    private PrintStream printStream;
    private Game game;
    private BufferedReader bufferedReader;
    private Player player;
    private Board board;
    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        player = mock(Player.class);
        board = mock(Board.class);

        game = new Game(printStream, bufferedReader, player, board);
    }

    @Test
    public void whenStartingDrawBoard() throws Exception {
        game.start();
        verify(board).printBoard();
    }

    @Test
    public void firstPlayerShouldMakeMoveAfterStarting() throws Exception {
        game.start();

        Player player1 = mock(Player.class);
        player1.move();
    }

}
