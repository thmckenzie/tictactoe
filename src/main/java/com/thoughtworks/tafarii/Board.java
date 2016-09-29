package com.thoughtworks.tafarii;

import java.io.PrintStream;

/**
 * Created by tafarii on 9/29/16.
 */
public class Board {
    String print = "";
    public PrintStream printStream;
    String[][] board;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        board = new String[][]{{"1","|","2","|","3"}, {"4","|","5","|","6"}, {"7","|","8","|","9"}};
    }

    public void printBoard(){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                print = print + board[row][column];
                //print = print + " " + board[row][column];
            }
            print = print + "\n";
        }
        printStream.println(print);
    }

    public void redraw(String symbol, String mark) {

    }
}
