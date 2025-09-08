package Card.Card;

import java.util.Scanner;

public class TestCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char cardIndex1;
        char cardIndex2;
        String yourCard1;
        String yourCard2;
        int yourCardNum1;
        int yourCardNum2;
        int fCardRandom;
        int rCardRandom;

        System.out.println("0.2% is the probability that both of your cards will match AI's both cards.");
        System.out.println("But its never 0%. Let's see if you are the lucky one.\n");

        System.out.println("S - Spades");
        System.out.println("C - Clovers");
        System.out.println("D - Diamonds");
        System.out.println("H - Hearts");

        System.out.print("\nChoose your first card: ");
        yourCard1 = input.next().toUpperCase();
        System.out.print("Choose your first card's number [1 - 13]: ");
        yourCardNum1 = input.nextInt();
        if (yourCardNum1 >= 14) {
            System.out.println("Nonexistent Card Number choose 1 - 13 only");
            return;
        }

        System.out.print("Choose your second card: ");
        yourCard2 = input.next().toUpperCase();
        System.out.print("Choose your second card's number [1 - 13]: ");
        yourCardNum2 = input.nextInt();
        if (yourCardNum2 >= 14) {
            System.out.println("Nonexistent Card Number choose 1 - 13 only");
            return;
        }

        fCardRandom = (int) (Math.random() * 100 % 13 + 1);
        rCardRandom = (int) (Math.random() * 100 % 13 + 1);

        input.close();
    }
}
