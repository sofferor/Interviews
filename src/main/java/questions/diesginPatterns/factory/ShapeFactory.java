package questions.diesginPatterns.factory;

public class ShapeFactory {
    public Shape createShape(String shape) {
        Shape specificShape = null;
        switch (shape) {
            case "Circle":
                specificShape = new Circle();
                break;
            case "Square":
                specificShape = new Square();
                break;
            default:
        }
        return specificShape;
    }
}
