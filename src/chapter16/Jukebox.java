package chapter16;

import java.util.*;
import java.io.*;

public class Jukebox {

    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox().go();
    }

    class ArtistCompare implements Comparator<Song> {
        @Override
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go() {
        getSongs();

        // prints out as read from the text file
        System.out.println("\n" +songList);

        // prints out as default sorted using Comparable
        Collections.sort(songList);
        System.out.println("\n" +songList);

        // prints out as sorted using Comparator by artist
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println("\n" +songList);

        // new collection using HashSet to remove duplicates
        HashSet<Song> songSet = new HashSet<>(songList);
        System.out.println(songSet);
    }

    public void getSongs() {
        try {
            File file = new File("SongList_v3.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");

        Song nextSong= new Song(tokens[0], tokens[1], tokens[2],  tokens[3]);
        songList.add(nextSong);
    }

}
