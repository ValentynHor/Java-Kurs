package section13_pattern.factory_method;

public class NewJeep extends Jeep {
    public void newFunction() {
        System.out.println("New fnk");
    }

    @Override
    public void drive() {
        System.out.println("170km/h");
    }
}
