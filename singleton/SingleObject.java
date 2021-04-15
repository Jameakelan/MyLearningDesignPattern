package singleton;

public class SingleObject {

    /// create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    /// not allow instantiate an external ojbect
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("SinglObject Message");
    }
}
