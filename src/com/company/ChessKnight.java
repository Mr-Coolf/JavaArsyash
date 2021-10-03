package com.company;

public class ChessKnight extends ChessFigures{
    public cPoint[] possibleSteps() {
        cPoint[] steps = new cPoint [8];
        int posX = position.X;
        int posY = position.Y;
        // Первый параметр trueOrFalse - сверху вниз Второй параметр - с лева на право.
        // лево вверх
        if (posX - 2 > 0 && posY + 1 < 8) {
            steps[0] = new cPoint(posX - 2 , posY + 1);
        }

        // лево вниз
        if (posX - 2 > 0 && posY - 1 > 0) {
            steps[1] = new cPoint(posX - 2 , posY - 1);
        }
        // вверх влево
        if (posX - 1 > 0 && posY + 2 < 8) {
            steps[2] = new cPoint(posX - 1 , posY + 2);
        }
        // вверх вправо
        if (posX + 1 < 8 && posY + 2 < 8) {
            steps[3] = new cPoint(posX + 1 , posY + 2);
        }
        // вправо вверх
        if (posX + 2 < 8 && posY + 1 < 8) {
            steps[4] = new cPoint(posX + 2 , posY + 1);
        }
        //вправо вниз
        if (posX + 2 < 8 && posY - 1 > 0) {
            steps[5] = new cPoint(posX + 2 , posY - 1);
        }
        // вниз вправо
        if (posX + 1 < 8 && posY - 2 > 0) {
            steps[6] = new cPoint(posX + 1, posY - 2);
        }
        // вниз влево
        if (posX - 1 > 0 && posY - 2 > 0) {
            steps[7] = new cPoint(posX - 1 , posY - 2);
        }

        return steps;
    }
    public boolean testPossibleSteps () {
        setPosition(0,7);
        cPoint steps[] = possibleSteps();
        String stepsInString= "";
        for ( int i = 0; i < 8; i++) {
            if (steps[i] != null )
                stepsInString += steps[i].X + " " + steps[i].Y + " ";
        }

        if (!stepsInString.equals("2 6 1 5 ")) return false;

        setPosition(0,0);
        steps = possibleSteps();
        stepsInString = "";
        for ( int i = 0; i < 8; i++) {
            if (steps[i] != null )
                stepsInString += steps[i].X + " " + steps[i].Y + " ";
        }
        if (!stepsInString.equals("1 2 2 1 ")) return false;

        setPosition(7,0);
        steps = possibleSteps();
        stepsInString = "";
        for ( int i = 0; i < 8; i++) {
            if (steps[i] != null )
                stepsInString += steps[i].X + " " + steps[i].Y + " ";
        }
        if (!stepsInString.equals("5 1 6 2 ")) return false;


        setPosition(7,7);
        steps = possibleSteps();
        stepsInString = "";
        for ( int i = 0; i < 8; i++) {
            if (steps[i] != null )
                stepsInString += steps[i].X + " " + steps[i].Y + " ";
        }
        if (!stepsInString.equals("5 6 6 5н ")) return false;
        return true;
    }
}
