package mannnD4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class diceGame {
    public static void main(String[] args) {
        int chance =1;
        while (chance <= 3) {
            int numb = ThreadLocalRandom.current().nextInt(1, 7);

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value that you guess");

            int guess = sc.nextInt();

            if (numb == guess) {
                System.out.println("You guessed the currect number " + guess);
                break;
            } else {
                System.out.println("sorry better luck next time, " +
                        "" + numb + " is the generated number");
            } chance++;
        }
    }
}
