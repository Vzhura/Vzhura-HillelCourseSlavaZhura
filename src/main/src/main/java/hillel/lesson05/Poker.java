package hillel.lesson05;

import java.util.Random;

public class Poker {
    private static final int NUMBER_OF_CARDS = 52;
    private final static int NUM_OF_PlAYERS = 4;

    private static String[] deck = new String[NUMBER_OF_CARDS];

    public static void main(String[] args) {
        createDeck();
        shuffleDeck();
        serveCards();
    }

    public static void createDeck() {
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

//        for (int i=0; i<NUMBER_OF_CARDS; i++) {
        int index = 0;
        for (String suit : suites) {
            for (String value : values) {
                deck[index++] = value + " of " + suit;
            }
        }
    }

    private static void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) ;
        int in = random.nextInt(NUMBER_OF_CARDS);
        int out = random.nextInt(NUMBER_OF_CARDS);

        String tmpCard = deck[in];
        deck[in] = deck[out];
        deck[out] = tmpCard;
    }

    public static void serveCards() {
        int index = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round: " + round);

            for (int player = 1; player <= NUM_OF_PlAYERS; player++) {
                System.out.println("Player " + player + " gets: " + deck[index++]);
            }
            System.out.println("====================\n");

        }
    }
}
