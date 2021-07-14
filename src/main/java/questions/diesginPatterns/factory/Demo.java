package questions.diesginPatterns.factory;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("Circle");
        shape.draw();
        shape = shapeFactory.createShape("Square");
        shape.draw();
    }
}
