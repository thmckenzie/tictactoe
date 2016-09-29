package com.thoughtworks.tafarii;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.nio.Buffer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static sun.audio.AudioPlayer.player;

/**
 * Created by tafarii on 9/29/16.
 */
public class PlayerTest {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private Player player;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        player = new Player(printStream, bufferedReader);
    }

    @Test
    public void shouldPromptUserToEnterNumberForMarkWhenMoving() throws Exception {
        when(bufferedReader.readLine()).thenReturn("3");
        player.move();
        verify(printStream).println("Please enter a number indicating where you would like to place your mark");
    }

}
