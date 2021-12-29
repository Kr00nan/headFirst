package chapter1;

public class GuessGame {

    // three instance variables for three Player objects
    Player p1;
    Player p2;
    Player p3;



    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // variables to hold the guesses the Players make
        int guessP1;
        int guessP2;
        int guessP3;

        boolean p1Right = false;
        boolean p2Right = false;
        boolean p3Right = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.printf("Number to guess is %s\n", targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.printf("Player one guessed %s\n", guessP1);
            guessP2 = p2.number;
            System.out.printf("Player two guessed %s\n", guessP2);
            guessP3 = p3.number;
            System.out.printf("Player three guessed %s\n", guessP3);

            if (guessP1 == targetNumber) {
                p1Right = true;
            }
            if (guessP2 == targetNumber) {
                p2Right = true;
            }
            if (guessP3 == targetNumber) {
                p3Right =  true;
            }

            if (p1Right || p2Right || p3Right) {
                System.out.println("We have a winner!");
                System.out.printf("Player one got it right? %s\n", p1Right);
                System.out.printf("Player two got it right? %s\n", p2Right);
                System.out.printf("Player three got it right? %s\n", p3Right);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.\n");
            }
        }
    }
}
