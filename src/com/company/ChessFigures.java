package com.company;

public class ChessFigures {
    String material;
    public cPoint position;
    boolean isAlive;
    String colour;
    public boolean setPosition (int X, int Y) {
        if ((X < 8 && X >= 0) && (Y < 8 && Y >= 0)) {
            position.X = X;
            position.Y = Y;
            return true;
        }
        return false;

    }
    public cPoint[] possibleSteps() {
        return null;
    }
    ChessFigures()
    {
        position = new cPoint(0, 0);
    }
}
