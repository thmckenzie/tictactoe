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
    private Board board;
    //Player player1 = new Player(printStream, bufferedReader);

    public Game(PrintStream printStream, BufferedReader bufferedReader, Player player, Board board) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.player1 = player;
        this.board = board;
    }

    public void start() {
        //printStream.println("1|2|3" + '\n' + "-----" + '\n' + "4|5|6" + '\n' + "-----" + '\n' + "7|8|9");
        board.printBoard();
        player1.move();
    }
}
