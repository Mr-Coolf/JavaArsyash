package com.company;

public class ChessBoard {
    private int[][] trueOrFalse;
    public String showChessBoard() {
        String finalWord = "  | 1| 2| 3| 4| 5| 6| 7| 8| \n";
        int secondment = 1;
        for (int counter0 = 0; counter0 < 8; counter0++) {
            finalWord += secondment + " |";
            secondment++;
            for (int counter1 = 0; counter1 < 8; counter1++) {
                String intConvertedToString = String.valueOf(trueOrFalse[counter0][counter1]);
                finalWord += intConvertedToString;
                if (trueOrFalse[counter0][counter1] > 9 ){
                    finalWord += "|";
                }else {
                    finalWord += " |";
                }
                intConvertedToString = "";
            }
            finalWord += "\n";
        }
        return finalWord;
    }

    public void clearBoard () {
        trueOrFalse = new int[8][8];
        for (int secondcounter1 = 0; secondcounter1 < 8; secondcounter1++) {
            for (int secondcounter2 = 0; secondcounter2 < 8; secondcounter2++) {

                trueOrFalse[secondcounter2][secondcounter1] = 0;
                secondcounter2++;
            }
        }
    }

    public void setCell(int Value, int X, int Y){
        trueOrFalse[X][Y] = Value;
    }
}
/* Первый параметр trueOrFalse - сверху вниз Второй параметр - с лева на право.
                   counter
                   trueOrFalse [counter[0]] [counter[1]]
                   String Court = " |1|2|3|4|5|6|7|8| \n"
                + "1|" + trueOrFalse[0] [0] + "|" + trueOrFalse[0] [1] + "|" + trueOrFalse[0] [2] + "|" + ;
 */
