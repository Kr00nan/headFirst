package chapter1;

public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.printf("I'm guessing %s\n", number);
    }
}
