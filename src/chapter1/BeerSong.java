package chapter1;

public class BeerSong {
    public static void main(String[] args){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {


            System.out.printf("\n%s %s of beer on the wall%n", beerNum, word);
            System.out.printf("%s %s of beer%n", beerNum, word);
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum--;
            if(beerNum == 1) { word = "bottle"; }


            if (beerNum > 0) {
                System.out.printf("%s %s of beer on the wall%n", beerNum, word);
            } else {
                System.out.println("\nNo more bottles of beer on the wall");
            }
        }
    }
}
