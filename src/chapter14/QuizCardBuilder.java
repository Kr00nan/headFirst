package chapter14;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class QuizCardBuilder {
    public void go() {
        // build and display gui
    }

    private class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            // add current card to the list and clear the text areas
        }
    }

    private class SaveMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            // bring up a file dialog box
            // let the user name and save the set
        }
    }

    private class NewMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            // clear out the card list, and clear out the text areas
        }
    }

    private void saveFile(File file) {
        // iterate through the list of cards, and write each one out to a text file
        // in a parseable way (in other words, with clear separations between parts
    }


}
