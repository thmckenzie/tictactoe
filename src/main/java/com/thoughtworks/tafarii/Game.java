package com.thoughtworks.tafarii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by tafarii on 9/29/16.
 */
public class Game {
    PrintStream printStream = new PrintStream(System.out);
    private BufferedReader bufferedReader;
    private Player player1;
    //Player player1 = new Player(printStream, bufferedReader);

    public Game(PrintStream printStream, BufferedReader bufferedReader, Player player) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.player1 = player;
    }

    public void start() {
        printStream.println("1|2|3" + '\n' + "-----" + '\n' + "4|5|6" + '\n' + "-----" + '\n' + "7|8|9");

        player1.move();
    }
}
