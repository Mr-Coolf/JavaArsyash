package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player myPlayer = new Player();
        myPlayer.testKnight(7, 7);
        ChessKnight myChessKnight = new ChessKnight();
        if (myChessKnight.testPossibleSteps()) System.out.println("Всё зашибись у коня");
        else System.out.println("Конь долбанулся тришечки");
    }
}
