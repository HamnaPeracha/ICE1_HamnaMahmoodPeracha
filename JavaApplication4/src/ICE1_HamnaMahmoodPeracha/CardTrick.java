/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICE1_HamnaMahmoodPeracha;
import java.util.Scanner;

/**
 *
 * @author hamna
 * Modifier: HamnaMahmoodPeracha
 * Student Number: 991799146
 * Date Modified: 02/06/2025
 */
public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        // Fill magicHand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(suits[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }

        // Lucky card (example, can be customized)
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        // Ask user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Pick a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card was not found.");
        }
    }
}
