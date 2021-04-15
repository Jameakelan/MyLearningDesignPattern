package builder;

/**
 * BUilderPatternDemo
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        Student _student = new StudentBuilder().setFirstName("Builder").setLastName("Pattern").setId(12345).setGrade("A").build();

        System.out.println(_student);
    }
}