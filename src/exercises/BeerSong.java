package exercises;

public class BeerSong {
    public static void main(String[] args){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {


            System.out.println(String.format("\n%s %s of beer on the wall", beerNum, word));
            System.out.println(String.format("%s %s of beer", beerNum, word));
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum--;
            if(beerNum == 1) { word = "bottle"; }


            if (beerNum > 0) {
                System.out.println(String.format("%s %s of beer on the wall", beerNum, word));
            } else {
                System.out.println("\nNo more bottles of beer on the wall");
            }
        }
    }
}
