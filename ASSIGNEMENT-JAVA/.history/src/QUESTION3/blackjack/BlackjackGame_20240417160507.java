package QUESTION3.blackjack;

import java.util.Scanner;

public class BlackjackGame {
    private Deck deck;
    private Hand dealerHand;
    private Hand playerHand;
    private Scanner scanner;

    public BlackjackGame() {
        deck = new Deck();
        deck.shuffle();
        dealerHand = new Hand();
        playerHand = new Hand();
        scanner = new Scanner(System.in);
    }

    public void play() {
        dealInitialCards();
        playerTurn();
        dealerTurn();
        determineWinner();
        scanner.close();
    }

    private void dealInitialCards() {
        playerHand.addCard(deck.drawCard());
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
        System.out.println("Dealer's Showing: " + dealerHand.showHand().split("\n")[0]); // Show only one card of the
                                                                                         // dealer
        System.out.println("Your Hand:\n" + playerHand.showHand());
    }

    private void playerTurn() {
        while (true) {
            System.out.print("Hit or Stand? (enter H or S): ");
            String playerChoice = scanner.nextLine();
            if (playerChoice.equalsIgnoreCase("H")) {
                playerHand.addCard(deck.drawCard());
                System.out.println("Your Hand:\n" + playerHand.showHand());
                if (playerHand.calculatePoints() > 21) {
                    System.out.println("You bust!");
                    return;
                }
            } else {
                break;
            }
        }
    }

    private void dealerTurn() {
        while (dealerHand.calculatePoints() < 17) {
            dealerHand.addCard(deck.drawCard());
        }
    }

    private void determineWinner() {
        int playerPoints = playerHand.calculatePoints();
        int dealerPoints = dealerHand.calculatePoints();

        System.out.println("Dealer's Hand:\n" + dealerHand.showHand());
        System.out.println("Dealer's Points: " + dealerPoints);
        System.out.println("Your Points: " + playerPoints);

        if (playerPoints > 21) {
            System.out.println("You bust! Dealer wins.");
        } else if (dealerPoints > 21 || playerPoints > dealerPoints) {
            System.out.println("You win!");
        } else if (playerPoints < dealerPoints) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();
        game.play();
    }
}
