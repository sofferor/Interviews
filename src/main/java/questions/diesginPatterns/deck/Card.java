package questions.diesginPatterns.deck;

public class Card {
    private Integer number;
    private Shape shape;

    public Card(Integer number, Shape shape) {
        this.number = number;
        this.shape = shape;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public enum Shape {
        a,
        b,
        c,
        d
    }
}
