// Harit Sombatsiri 6510451018

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private final int maxSize = 40;
    private ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<>();
        String names[] = {"S1", "S2", "S3", "S4", "S5",
                "S6", "S7", "S8", "S9", "S10",
                "S11", "S12", "S13", "S14", "S15",
                "S16", "S17", "S18", "S19", "S20",
                "S21", "S22", "S23", "S24", "S25",
                "S26", "S27", "S28", "S29", "S30",
                "S31", "S32", "S33", "S34", "S35",
                "S36", "S37", "S38", "S39", "S40"};

        for(int i = 0; i < maxSize; i++) {
            squares.add(new Square(names[i]));
        }
    }
    Square getSquare(Square oldLoc, int faceValue) {
        int calLocation = faceValue + squares.indexOf(oldLoc);
        if(calLocation > maxSize) {
            calLocation -= maxSize;
        }
        return squares.get(calLocation-1);
    }

}
