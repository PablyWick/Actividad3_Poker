public class Card {
    private final String suit;
    private final String color;
    private final String value;

    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + "," + color + "," + value;
    }
}
