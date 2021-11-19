package DotComGame;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;

    public void setUpGame(){
        // make three DotCom objects and name them
        DotCom one = new DotCom("Go2.com");
        DotCom two = new DotCom("Pets.com");
        DotCom three = new DotCom("eToys.com");

        // add them to the list
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(){
        // loops through all remaining DotCom objects
        // calls each DotCom object's checkYourself() method
    }

    public void finishGame(){
        // prints a message about the user's performance, based on how many guesses it took to sink all the DotComs
    }
}
