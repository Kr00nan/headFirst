package simpleDotComGame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        // initial code; trying to figure it out for myself
//        int numOfGuesses = 0;
//        String userGuess;
//        SimpleDotCom dot = new SimpleDotCom();
//        Scanner scanner = new Scanner(System.in);
//        int locationStart = (int)(Math.random() * 4);
//        int[] locs = {locationStart, locationStart + 1, locationStart + 2};
//        dot.setLocationCells(locs);
//
//        do {
//            System.out.println("enter a number ");
//            userGuess = scanner.next();
//        } while (dot.checkYourself(userGuess) != "kill");
//        System.out.printf("You took %s guesses.", numOfGuesses);

        // book code; their answer
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
