package javaexecution;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int attemptsPerRound = 3;
        int totalRounds = 3;
        int score = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\nRound " + round);
            int targetNumber = random.nextInt(10) + 1;
            
            for (int attempt = 1; attempt <= attemptsPerRound; attempt++) {
                System.out.print("Guess the number (Attempt " + attempt + "): ");
                int guess = scanner.nextInt();
                
                if (guess == targetNumber) {
                    System.out.println("Correct!");
                    score++;
                    break;
                } else {
                    System.out.println("Incorrect. Try again.");
                }
            }
            
            System.out.println("Round " + round + " Score: " + score);
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        System.out.println("\nTotal Score: " + score);
        
        scanner.close();
    }
}
