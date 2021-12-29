package chapter10;

public class Player {
    // default value for declared int type is 0
    static int playerCount;
    private String name;
    public Player(String n) {
        name = n;
        playerCount++;
    }
}