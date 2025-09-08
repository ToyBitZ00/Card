package Card.Card;

import java.util.Scanner;

public class TestCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char cardIndex1;
        char cardIndex2;
        String card;
        int random1;
        int random2;

        System.out.print("Choose your first card: ");
        card = input.next();
        cardIndex1 = card.charAt(0);

        System.out.print("Choose your second card: ");
        card = input.next();
        cardIndex2 = card.charAt(0);

        random1 = (int) (Math.random() * 100 % 13 + 1);
        random2 = (int) (Math.random() * 100 % 13 + 1);
    }
}
