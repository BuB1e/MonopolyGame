//6510451018

import java.util.ArrayList;
import java.util.List;

public class MGame {
    private int roundCnt;
    private ArrayList<Die> dice;
    private Board board;
    private ArrayList<Player> players;
    private int n;
    public void playGame() {
        while(roundCnt < n) {
            playRound();
        }
    }
    private void playRound() {
        for(int i = 0; i < players.size(); i++) {
            players.get(i).takeTurn();
        }
    }
}
