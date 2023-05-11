package HW10;

import java.util.Random;

public class HW_Exception {

    public class Poker {
        private static final int NUMBER_OF_CARDS = 52;
        private final static int NUM_OF_PlAYERS = 4;

        private static String[] deck = new String[NUMBER_OF_CARDS];

        public static void main(String[] args) throws DeckShuffleException, Exception {
            createDeck();
            shuffleDeck();
            serveCards();
        }
        public static void createDeck() throws DeckCreationException {
            String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
            String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

            try {
                int index = 0;
                for (String suit : suites) {
                    for (String value : values) {
                        deck[index++] = value + " of " + suit;
                    }
                }
            } catch (Exception e) {
                throw new DeckCreationException("Error creating deck", e);
            }
        }
        private static void shuffleDeck() throws DeckShuffleException {
            Random random = new Random();
            for (int i = 0; i < 100; i++);
            int in = random.nextInt(NUMBER_OF_CARDS);
            int out = random.nextInt(NUMBER_OF_CARDS);

            if (in == out) {
                throw new DeckShuffleException("The same card was randomly selected for both 'in' and 'out'");
            }

            try {
                String tmpCard = deck[in];
                deck[in] = deck[out];
                deck[out] = tmpCard;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new DeckShuffleException("An index out of bounds exception occurred while shuffling the deck");
            }
        }

        public static void serveCards() {
            int index = 0;
            for (int round = 1; round <= 5; round++) {
                System.out.println("Round: " + round);

                for (int player = 1; player <= NUM_OF_PlAYERS; player++) {
                    try {
                        if (index >= NUMBER_OF_CARDS) {
                            throw new RuntimeException("Deck is empty");
                        }
                        System.out.println("Player " + player + " gets: " + deck[index++]);
                    } catch (RuntimeException e) {
                        System.err.println("Error: " + e.getMessage());
                        System.exit(1);
                    }
                }
                System.out.println("====================\n");
            }
        }
    }
}