package com.company;

public class Player {
    ChessBoard myChessBoard = new ChessBoard();
    ChessKnight myChessKnight = new ChessKnight();
    ChessFigures myChessFigures = new ChessFigures();
    public int counter;
    public void testKnight (int firstpos, int secondpos) {
        myChessBoard.clearBoard();
        System.out.println(myChessBoard.showChessBoard());
        myChessKnight.setPosition(firstpos, secondpos);
        cPoint steps[] = myChessKnight.possibleSteps();
        for ( int i = 0; i < 8; i++) {
            if (steps[i] != null ) System.out.println(steps[i].X + " " + steps[i].Y);
        }
    }

    public void KnightMoving (int startPosX, int startPosY) {
        int counterForPossibleSteps = 0;
        int counter = 2;
        myChessBoard.clearBoard();
        System.out.println(myChessBoard.showChessBoard());
        cPoint pos  = new cPoint(startPosX, startPosY);
        myChessBoard.setCell(1, pos.X, pos.Y);
        System.out.println(myChessBoard.showChessBoard());
        cPoint[] possibleSteps = new cPoint[8];

        for (int i = 0; i < 60; i++) {
            possibleSteps = KnightMoves(pos.X, pos.Y);
            while (counterForPossibleSteps < 8) {
                if (possibleSteps[counterForPossibleSteps] != null)
                    if (myChessBoard.checkCell(possibleSteps[counterForPossibleSteps].X, possibleSteps[counterForPossibleSteps].Y) == true){
                        myChessBoard.setCell(counter, possibleSteps[counterForPossibleSteps].X, possibleSteps[counterForPossibleSteps].Y);
                        pos.X = possibleSteps[counterForPossibleSteps].X;
                        pos.Y = possibleSteps[counterForPossibleSteps].Y;
                        counter++;
                        System.out.println(myChessBoard.showChessBoard());
                        counterForPossibleSteps = 0;
                        break;
                    }
                counterForPossibleSteps++;
            }



        }

    }
    /*public void fullBoardWithKnightsMoves (int startingPos1, int startingPos2) {
        myChessBoard.clearBoard();
        myChessBoard.setCell(1, startingPos1, startingPos2);
        cPoint PosForNext = new cPoint(startingPos1, startingPos2);
        settingCellsWithNumberOfKnightMoves(PosForNext);
    }


    public int movescounter = 2;
    public int StepsCounter = 0;
    public cPoint pos;
    public void settingCellsWithNumberOfKnightMoves (cPoint startPos) {
        if (movescounter == 2) {
            return;
        }
        cPoint[] steps = new cPoint[8];
        steps = KnightMoves(startPos.X, startPos.Y);
        movescounter++;
        if (steps[StepsCounter] != null) {
            myChessBoard.setCell(movescounter, steps[StepsCounter].X, steps[StepsCounter].Y);
            pos.X = steps[StepsCounter].X;
            pos.Y = steps[StepsCounter].Y;
            StepsCounter = 0;
        } else {
            StepsCounter++;
        }
        settingCellsWithNumberOfKnightMoves(pos);
    }*/

    public cPoint[] KnightMoves (int firstpos, int secondPos) {
        myChessKnight.setPosition(firstpos, secondPos);
        cPoint moves[] = myChessKnight.possibleSteps();
        return moves;
    }
}
