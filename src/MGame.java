// Harit Sombatsiri 6510451018

import java.util.ArrayList;

public class MGame {
    private int roundCnt;
    private ArrayList<Die> dice;
    private Board board;
    private ArrayList<Player> players;
    private int n;

    public MGame(ArrayList<Player> players, int n) {
        if(players.size() < 2) {
            System.out.println("Not enough player.");
            System.exit(1);
        } else if (players.size() > 8) {
            System.out.println("Too many players. Max player = 8.");
            System.exit(1);
        }
        roundCnt = 1;
        dice = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            dice.add(new Die());
        }
        for(int i = 0; i < players.size(); i++) {
            players.get(i).setDice(dice);
        }
        this.board = new Board();
        this.players = players;
        this.n = n;
    }
    public void playGame() {
        while(roundCnt <= n) {
            System.out.println("Start round : " + roundCnt);
            playRound();
            roundCnt++;
        }
    }
    private void playRound() {
        for(int i = 0; i < players.size(); i++) {
            System.out.println("Turn of " + players.get(i).getName() + ".");
            players.get(i).takeTurn();
        }
        System.out.println("--------------- Round " + roundCnt + " End ---------------");
    }
}
