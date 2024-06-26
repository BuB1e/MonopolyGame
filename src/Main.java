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
//        Player player6 = new Player("Best1");
//        Player player7 = new Player("Best2");
//        Player player8 = new Player("Best3");
//        Player player9 = new Player("Best4");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
//        players.add(player6);
//        players.add(player7);
//        players.add(player8);
//        players.add(player9);
        MGame monopolyGame = new MGame(players, 1000); // 2nd parameter = max round
        monopolyGame.playGame();
    }
}