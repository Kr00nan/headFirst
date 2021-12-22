package chapter14;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardPlayer {

    private JTextArea display;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private QuizCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

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
            JFileChooser fileOpen = new JFileChooser();
            fileOpen.showOpenDialog(frame);
            // let the user navigate to and choose a card set to open
            loadFile(fileOpen.getSelectedFile());
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
        String[] result = lineToParse.split(" / ");
        // and parses into two pieces--question and answer--and creates a new QuizCard
        QuizCard card = new QuizCard(result[0], result[1]);
        // and adds it to the ArrayList called CardList
        cardList.add(card);
        System.out.println("made a card");
    }

    private void showNextCard() {
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
    }
}
