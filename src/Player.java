//6510451018

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Die> dice;
    private Board board;
    private Piece piece;
    public Player(String name) {
        this.name = name;
        this.board = new Board();
        this.piece = new Piece();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Die> getDice() {
        return dice;
    }

    public void setDice(ArrayList<Die> dice) {
        this.dice = dice;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void takeTurn()  {
        int faceValue = 0;
        Square oldLoc;
        Square newLoc;
        String diceNum;
        for(int i = 0; i < 2; i++) {
            dice.get(i).roll();
            faceValue += dice.get(i).getFaceValue();
            if(i == 0) {
                diceNum = "1st";
            } else {
                diceNum = "2nd";
            }
            System.out.println(diceNum + " Roll = " + dice.get(i).getFaceValue());
        }
        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, faceValue);
        piece.setLocation(newLoc);
        System.out.println("Total face value : " + faceValue);
        System.out.println(this.name + " move from " + oldLoc.getName() + " to " + newLoc.getName());
        System.out.println("------------------------------");
    }

}
