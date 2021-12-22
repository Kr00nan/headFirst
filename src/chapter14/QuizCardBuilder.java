package chapter14;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.*;

public class QuizCardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }
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

    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    private void saveFile(File file) {
        // iterate through the list of cards, and write each one out to a text file
        // in a parseable way (in other words, with clear separations between parts
    }


}
