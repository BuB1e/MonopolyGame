//6510451018

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Ter");
        Player player2 = new Player("Non");
        Player player3 = new Player("Big");
        Player player4 = new Player("Win");
        Player player5 = new Player("Best");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        MGame monopolyGame = new MGame(players, 50); // 2nd parameter = max round
        monopolyGame.playGame();
    }
}