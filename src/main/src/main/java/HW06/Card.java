package HW06;
public class Card {
    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public String toString() {
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {" Clubs", " Diamonds", " Hearts", " Spades"};

        return values[value] + suits[suit];
    }
}