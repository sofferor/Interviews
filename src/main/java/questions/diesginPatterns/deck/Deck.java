package questions.diesginPatterns.deck;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>(52);
        for (Card.Shape shape : Card.Shape.values()) {
            for (int i = 1; i <= 13; i++) {
                Card card = new Card(i, shape);
                cards.add(card);
            }
        }
    }
}
