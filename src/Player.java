//6510451018

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Die> dice;
    private Piece piece;
    public Player(String name) {
        this.name = name;
    }
    public void takeTurn()  {
        int faceValue = 0;
        for(int i = 0; i < dice.size(); i++) {
            dice.get(i).roll();
            faceValue += dice.get(i).getFaceValue();
        }
    }

}
