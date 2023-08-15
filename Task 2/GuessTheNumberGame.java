import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int currentRound = 1;
        int score = 0;

        Random random = new Random();
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to Guess the Number game!\n");

        Scanner scanner = new Scanner(System.in);

        while (currentRound <= maxAttempts) {
            System.out.print("Round " + currentRound + " - Enter your guess between " + lowerBound + " and " + upperBound + ": ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                score += maxAttempts - currentRound + 1;
                System.out.println("Congratulations! You guessed the number. Your score: " + score);
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Try again! Your guess is too low.");
            } else {
                System.out.println("Try again! Your guess is too high.");
            }

            currentRound++;
        }

        if (currentRound > maxAttempts) {
            System.out.println("Out of attempts. The number was " + targetNumber + ". Your score: " + score);
        }

        scanner.close();
    }
}
