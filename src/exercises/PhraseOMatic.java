package exercises;

public class PhraseOMatic {
    public static void main(String[] args){

        // create 3 string arrays with cool buzz-words
        String[] wordListOne = new String[]{
                "24/7", "30,000 foot", "B2B", "critical-path", "dynamic",
                "front-end", "multi-Tier", "pervasive", "six-sigma", "smart",
                "web-based", "win-win"
        };

        String[] wordListTwo = new String[]{
                "accelerated", "aligned", "branded", "centric", "clustered",
                "cooperative", "distributed", "empowered", "focused", "leveraged",
                "networked", "oriented", "outside-the-box", "positioned", "shared", "sticky",
                "targeted", "value-added"
        };

        String[] wordListThree = new String[]{
                "architecture", "core competency", "mindshare", "mission", "paradigm",
                "portal", "process", "solution", "space", "strategy", "tipping-point", "vision"
        };

        // randomize index numbers based on array lengths
        int rand1 = (int) (Math.random() * wordListOne.length);
        int rand2 = (int) (Math.random() * wordListTwo.length);
        int rand3 = (int) (Math.random() * wordListThree.length);

        // generate solution to what ever problem ails ya!
        System.out.printf("What we need is a %s %s %s...%n", wordListOne[rand1], wordListTwo[rand2], wordListThree[rand3]);

    }
}
