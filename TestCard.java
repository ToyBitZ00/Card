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

        char[] suits = { 'S', 'C', 'D', 'H' };

        int fCardNumRandomAI;
        int sCardNumRandomAI;

        System.out.println("0.2% is the probability that both of your cards will match AI's both cards.");
        System.out.println("But its never 0%. Let's see if you are the lucky one.\n");

        System.out.println("S - Spades");
        System.out.println("C - Clovers");
        System.out.println("D - Diamonds");
        System.out.println("H - Hearts");

        System.out.print("\nChoose your first card: ");
        yourCard1 = input.next().toUpperCase();
        if (!yourCard1.equals("S") && !yourCard1.equals("C") && !yourCard1.equals("D") && !yourCard1.equals("H")) {
            System.out.println("Invalid Card Suits");
            return;
        }
        System.out.print("Choose your first card's number [1 - 13]: ");
        yourCardNum1 = input.nextInt();
        if (yourCardNum1 >= 14) {
            System.out.println("Nonexistent Card Number choose 1 - 13 only");
            return;
        }

        System.out.print("Choose your second card: ");
        yourCard2 = input.next().toUpperCase();
        if (!yourCard2.equals("S") && !yourCard2.equals("C") && !yourCard2.equals("D") && !yourCard2.equals("H")) {
            System.out.println("Invalid Card Suits");
            return;
        }
        System.out.print("Choose your second card's number [1 - 13]: ");
        yourCardNum2 = input.nextInt();
        if (yourCardNum2 >= 14) {
            System.out.println("Nonexistent Card Number choose 1 - 13 only");
            return;
        }

        int index1 = rand.nextInt(suits.length);
        int index2 = rand.nextInt(suits.length);
        char randomSuit1 = suits[index1];
        char randomSuit2 = suits[index2];

        fCardNumRandomAI = (int) (Math.random() * 100 % 13 + 1);
        sCardNumRandomAI = (int) (Math.random() * 100 % 13 + 1);

        System.out.println("The AI's first card suit is: " + randomSuit1);
        System.out.println("The Ai's first card number is: " + fCardNumRandomAI);
        System.out.println("The AI's second card suit is: " + randomSuit2);
        System.out.println("The AI's second card number is: " + sCardNumRandomAI);

        input.close();
    }
}
