package factory_method;

/**
 * For Generating object by given information
 */
public class ShapeFactory {
    public Shape getShape(String type) {
        switch (type.toLowerCase()) {
        case "circle":
            return new Circle();
        case "rectangle":
            return new Rectangle();
        case "square":
            return new Square();
        default:
            return null;
        }
    }
}
