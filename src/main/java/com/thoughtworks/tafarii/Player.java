package com.thoughtworks.tafarii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by tafarii on 9/29/16.
 */
public class Player {
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Player(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void move() {
        printStream.println("Please enter a number indicating where you would like to place your mark");
        String mark;
        try {
            mark = bufferedReader.readLine();
            if(mark.equals("3")){
                printStream.println("1|2|X" + '\n' + "-----" + '\n' + "4|5|6" + '\n' + "-----" + '\n' + "7|8|9");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
