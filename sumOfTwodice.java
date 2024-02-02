

import java.util.Random;

public class sumOfTwodice {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random rand = new Random();

        // Generate random integers between 1 and 6 for two dice
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;

        // Calculate the sum of the two dice
        int sum = dice1 + dice2;
        System.out.println("Sum of two dice: " + sum);

        // Print the result
        System.out.println("Rolling two dice...");
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
//        System.out.println("Sum of two dice: " + sum);
    }
}
