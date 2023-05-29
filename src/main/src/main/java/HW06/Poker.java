package HW06;
public class Poker {
    private final static int NUM_OF_PlAYERS = 4;
    private static final int NUM_OF_CARDS_PER_PLAYER = 5;

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        for (int round = 1; round <= NUM_OF_CARDS_PER_PLAYER; round++) {
            System.out.println("Round: " + round);

            for (int player = 1; player <= NUM_OF_PlAYERS; player++) {
                Card card = deck.dealCard();
                System.out.println("Player " + player + " gets: " + card.toString());
            }

            System.out.println("====================\n");
        }
    }
}


