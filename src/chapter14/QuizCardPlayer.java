package chapter14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizCardPlayer {
    public void go() {
        // build and display gui
    }

    class nextCardListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // if this is a question, show the answer, otherwise now next question
            // set a flag for whether we're viewing a question or answer
        }
    }

    class OpenMenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // bring up a file dialog box
            // let the user navigate to and choose a card set to open
        }
    }

    private void loadFile(File file) {
        // must build an ArrayList of cards, by reading them from a text file
        // called from the OpenMenuListener event handler, reads the file one line at a time
        // and tells the makeCard() method to make a new card out of line
        // (one line in the file holds both the question and answer, separated by a "/"
    }

    private void makeCard(String lineToParse) {
        // called by the loadFile method, takes a line from the text file
        // and parses into two pieces--question and answer--and creates a new QuizCard
        // and adds it to the ArrayList called CardList
    }


}
