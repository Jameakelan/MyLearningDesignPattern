package abstract_factory;

public class AbstracFactoryPatternDemo {
    public static void main(String[] args) {
        // get shap by FactoryProducer
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shapeRectangle = shapeFactory.getShape("rectangle");
        shapeRectangle.draw();

        AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true);
        Shape shapeRecRounded = shapeFactoryRounded.getShape("rectangle");
        shapeRecRounded.draw();
    }
}
