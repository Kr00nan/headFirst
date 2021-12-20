package musicapp;

import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;

public class BeatBox {

    JPanel mainPanel;
    ArrayList<JCheckBox> checkboxList;
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame theFrame;

    String[] instrumentNames = {
            "Bass",
            "Closed Hi-Hat",
            "Open Hi-Hat",
            "Acoustic Snare",
            "Crash Cymbal",
            "Hand Clap",
            "High Tom",
            "Hi Bongo",
            "Maracas",
            "Whistle",
            "Low Conga",
            "Cowbell",
            "Vibraslap",
            "Low-mid Tom",
            "High Agogo",
            "Open Hi Conga"
    };

    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }

    public void buildGUI() {

    }

    public void setUpMidi() {

    }

    public void buildTrackAndStart() {

    }

    public class MyStartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buildTrackAndStart();
        }
    }

    public class MyStopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.stop();
        }
    }

    public class MyUpTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * 1.03));
        }
    }

    public class MyDownTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * .97));
        }
    }

    public void makeTracks(int[] list) {

    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {

    }
}
