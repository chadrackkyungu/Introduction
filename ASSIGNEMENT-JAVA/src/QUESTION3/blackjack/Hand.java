package QUESTION3.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int calculatePoints() {
        int totalPoints = 0;
        int aceCount = 0;

        for (Card card : cards) {
            String rank = card.getRank();
            if (rank.equals("Ace")) {
                aceCount++;
                totalPoints += 11;
            } else if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
                totalPoints += 10;
            } else {
                totalPoints += Integer.parseInt(rank);
            }
        }

        while (totalPoints > 21 && aceCount > 0) {
            totalPoints -= 10; // Convert an Ace from 11 to 1
            aceCount--;
        }

        return totalPoints;
    }

    public String showHand() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }
}