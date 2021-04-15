package singleton;

/**
 * SingleObjectPatternDemo
 */
public class SingleObjectPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}