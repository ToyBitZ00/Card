package Card.Card;

import java.util.Scanner;
import java.util.Random;

public class TestCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String yourCard1;
        String yourCard2;
        int yourCardNum1;
        int yourCardNum2;

        int fCardRandomOpp = (int) (Math.random() * 100 % 13 + 1);
        int sCardRandomOpp = (int) (Math.random() * 100 % 13 + 1);
        ;
        String[] suits = { "S", "C", "D", "H" };
        int index1 = rand.nextInt(suits.length);
        int index2 = rand.nextInt(suits.length);
        String randomSuit1 = suits[index1];
        String randomSuit2 = suits[index2];

        String ans;

        System.out.println("0.2% is the probability that both of your cards will match AI's both cards.");
        System.out.println("But its never 0%. Let's see if you are the lucky one.\n");

        System.out.println("S - Spades");
        System.out.println("C - Clovers");
        System.out.println("D - Diamonds");
        System.out.println("H - Hearts");

        do {
            System.out.print("\nChoose your first card: ");
            yourCard1 = input.next().toUpperCase();
            if (!yourCard1.equals("S") && !yourCard1.equals("C") && !yourCard1.equals("D") && !yourCard1.equals("H")) {
                System.out.println("Invalid Card Suits");
                input.close();
                return;
            }
            System.out.print("Choose your first card's number [1 - 13]: ");
            yourCardNum1 = input.nextInt();
            if (yourCardNum1 >= 14) {
                System.out.println("Nonexistent Card Number choose 1 - 13 only");
                input.close();
                return;
            }

            System.out.print("Choose your second card: ");
            yourCard2 = input.next().toUpperCase();
            if (!yourCard2.equals("S") && !yourCard2.equals("C") && !yourCard2.equals("D") && !yourCard2.equals("H")) {
                System.out.println("Invalid Card Suits");
                input.close();
                return;
            }
            System.out.print("Choose your second card's number [1 - 13]: ");
            yourCardNum2 = input.nextInt();
            if (yourCardNum2 >= 14) {
                System.out.println("Nonexistent Card Number choose 1 - 13 only");
                input.close();
                return;
            }

            System.out.println("\nThe Opponent's first card suit is: " + randomSuit1);
            System.out.println("The Opponent's first card number is: " + fCardRandomOpp);
            System.out.println("The Opponent's second card suit is: " + randomSuit2);
            System.out.println("The Opponent's second card number is: " + sCardRandomOpp);

            // This checks if both of your card's suits matched the opponents cards
            if (yourCard1.equals(randomSuit1) && yourCard2.equals(randomSuit2)
                    || yourCard1.equals(randomSuit2) && yourCard2.equals(randomSuit1)) {
                // This checks if both of your cards number matches the opponents numbers
                if (yourCardNum1 == fCardRandomOpp && yourCardNum2 == sCardRandomOpp
                        || yourCardNum1 == sCardRandomOpp && yourCardNum2 == fCardRandomOpp) {
                    System.out.println("\nCONGRATULATIONS YOU MATCHED THE OPPONENTS's BOTH SUITS AND NUMBERS");
                }
                // This checks if any of your card's numbers matches the opponents card's
                // numbers
                else if ((yourCardNum1 == fCardRandomOpp || yourCardNum2 == sCardRandomOpp)) {
                    System.out.println("YOU MATCHED ONE OF THE OPPONENT's CARD WITH SUITS AND NUMBER");
                    System.out.println("TRY AGAIN LATER");
                } else {
                    System.out.println("SORRY YOU ONLY MATCHED BOTH OF OPPONENT's CARDS WITH SUITS BUT NOT NUMBERS");
                    System.out.println("TRY AGAIN LATER");
                }
            }
            // This checks if one of your card's suits matches the opponents card's suits
            else if ((yourCard1.equals(randomSuit1) || yourCard2.equals(randomSuit2))
                    || (yourCard1.equals(randomSuit2) || yourCard2.equals(randomSuit1))) {
                // This checks if one of your card's number matches the opponents card's number
                if ((yourCardNum1 == fCardRandomOpp) || (yourCardNum2 == sCardRandomOpp)) {
                    System.out.println("YOU MATCHED ONE THE OPPONENTS's CARD WITH BOTH SUITS AND NUMBERS");
                } else {
                    System.out.println("SORRY YOU ONLY MATCHED ONE OF THE OPPONENT's CARD WITH SUITS");
                    System.out.println("TRY AGAIN LATER");
                }
            } else {
                System.out.println("SORRY YOU DIDN'T MATCH ANY OF THE OPPONENT's CARDS ");
            }
            System.out.print("Would you like to try again? [Y/N]: ");
            ans = input.next().toUpperCase();
        } while (ans.equals("Y"));
        input.close();
    }
}
