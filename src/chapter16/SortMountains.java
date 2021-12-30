package chapter16;

import java.util.*;

public class SortMountains {
    LinkedList<Mountain> mtn = new LinkedList<>();

    class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o2.height - o1.height;
        }
    }

    public void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        // linkedlist as created
        System.out.println("as entered:\n" + mtn);

        // linkedlist sorted by name
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("by name:\n" + mtn);

        // linked sorted by height
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("by height:\n" + mtn);
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }
}

class Mountain {
    String name;
    int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}
