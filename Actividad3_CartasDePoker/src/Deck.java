import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;
    private int size;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
        size = cards.size();
    }

    private void initializeDeck() {
        String[] suits = {"tréboles", "corazones", "picas", "diamantes"};
        String[] colors = {"negro", "rojo"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : suits) {
            for (String color : colors) {
                for (String value : values) {
                    cards.add(new Card(suit, color, value));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (size > 0) {
            Card card = cards.remove(0);
            size--;
            System.out.println(card.toString());
        }
        System.out.println("Quedan " + size + " cartas en deck.");
    }

    public void pick() {
        if (size > 0) {
            int index = (int) (Math.random() * size);
            Card card = cards.remove(index);
            size--;
            System.out.println(card.toString());
        }
        System.out.println("Quedan " + size + " cartas en deck.");
    }

    public void hand() {
        if (size >= 5) {
            System.out.println("Tu mano:");
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                size--;
                System.out.println(card.toString());
            }
        } else {
            System.out.println("No hay suficientes cartas para repartir una mano completa.");
        }
        System.out.println("Quedan " + size + " cartas en deck.");
    }
}
