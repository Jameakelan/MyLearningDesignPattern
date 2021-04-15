package abstract_factory;

/**
 * FactoryProducer to get Abstract Factory in order ot get factories of concrete
 * class by passing an information;
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
