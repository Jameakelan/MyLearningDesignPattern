package factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory _factory = new ShapeFactory();

        /// Create Circle object
        Shape shape = _factory.getShape("Circle");

        shape.draw();
    }

}
