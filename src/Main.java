import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("You are about to enter a very serious game of rock paper scissors.");

        // Create scanner for user input detection
        Scanner scanner = new Scanner(System.in);

        // Create continuous loop for continuous play
        while (true) {
            System.out.println("Enter either rock, paper or scissors (or exit to end game): ");
            String userChoice = scanner.nextLine().toLowerCase(); // String method 'toLowerCase' to avoid case sensitivity issues

            if (userChoice.equals("exit")) {
                System.out.println("See you next time.");
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")){
                System.out.println("You entered an invalid choice; try again with either 'rock' or 'paper' or 'scissors'.");
            }

            // Computer choice String array & random array position selector with bound of 3
            String[] choices = {"rock", "paper", "scissors"}; // String array for switch statement
            Random random = new Random();
            String randomComputerChoice = choices[random.nextInt(3)]; // Random
            System.out.println("I have chosen " + randomComputerChoice + ".");


        }

    }

}