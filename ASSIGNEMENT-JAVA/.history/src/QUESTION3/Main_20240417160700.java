package QUESTION3;

import QUESTION3.blackjack.BlackjackGame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");

        // Create a new game instance
        BlackjackGame game = new BlackjackGame();

        // Start the game
        game.play();

        // After the game ends
        System.out.println("Thank you for playing!");
    }
}