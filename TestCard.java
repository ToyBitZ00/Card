package Card.Card;

import java.util.Scanner;

public class TestCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char card1;
        char card2;
        String card;

        System.out.print("Choose your first card: ");
        card = input.next();
        card1 = card.charAt(0);

        System.out.print("Choose your second card: ");
        card = input.next();
        card2 = card.charAt(0);
    }
}
