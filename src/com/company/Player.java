package com.company;

public class Player {
    public int counter;
    public void testKnight (int firstpos, int secondpos) {
        ChessBoard myChessBoard = new ChessBoard();
        myChessBoard.clearBoard();
        System.out.println(myChessBoard.showChessBoard());
        ChessKnight myChessKnight = new ChessKnight();
        myChessKnight.setPosition(firstpos, secondpos);
        cPoint steps[] = myChessKnight.possibleSteps();
        for ( int i = 0; i < 8; i++) {
            if (steps[i] != null ) System.out.println(steps[i].X + " " + steps[i].Y);
        }
    }
    public String fullBoardWithKnightsMoves (cPoint startingPos) {
        return "1";
    }
}
