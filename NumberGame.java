package com.solution.main;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain;

        do {
            int targetNumber = random.nextInt(100) + 1;  
            int attempts = 5; 
            int lowerBound = 1;
            int upperBound = 100;
            boolean guessedCorrectly = false;

            System.out.println("-------------------------WELCOME TO THE NUMBER GUESSER GAME----------------------");
            System.out.println("\nComputer has picked a number between 1 and 100.");
            System.out.println("Try to guess it!");
            System.out.println("You have " + attempts + " attempts. The range will narrow with each guess.");
            System.out.println("--------------------------------------------------------------------------------");

            while (attempts > 0) {
                System.out.print("Enter your guess (" + lowerBound + " to " + upperBound + "): ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations!!!! You guessed the correct number.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too lower!");
                    lowerBound = Math.max(lowerBound, userGuess + 1);
                } else {
                    System.out.println("Too higher!");
                    upperBound = Math.min(upperBound, userGuess - 1);
                }

                attempts--;
                System.out.println("New range: " + lowerBound + " to " + upperBound + " | Attempts remaining: " + attempts);
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts!");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(" The correct number was: " + targetNumber);
            }

            System.out.print("Would you like to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);
        
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Game over! The final score is: " + score);
        scanner.close();
    }
}
