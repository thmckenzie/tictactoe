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

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        player = mock(Player.class);

        game = new Game(printStream, bufferedReader, player);
    }

    @Test
    public void whenStartingDrawBoard() throws Exception {
        game.start();
        verify(printStream).println("1|2|3" +'\n' + "-----" + '\n' + "4|5|6" + '\n' + "-----" + '\n' + "7|8|9");
    }

    @Test
    public void firstPlayerShouldMakeMoveAfterStarting() throws Exception {
        game.start();

        Player player1 = mock(Player.class);
        (player1).move();
    }

}
