package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ChessBoard myChessBoard = new ChessBoard();
        myChessBoard.clearBoard();
        myChessBoard.setCell(12, 2, 4);
        System.out.println(myChessBoard.showChessBoard());
    }
}
