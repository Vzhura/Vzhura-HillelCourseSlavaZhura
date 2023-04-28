package HW06;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (int suit = 0; suit < 4; suit++) {
            for (int value = 0; value < 13; value++) {
                cards.add(new Card(value, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            return null;
        } else {
            return cards.remove(0);
        }
    }
}

