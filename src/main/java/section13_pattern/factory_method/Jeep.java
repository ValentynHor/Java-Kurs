package section13_pattern.factory_method;

public class Jeep implements Car{
    @Override
    public void drive() {
        System.out.println("150km/h");
    }

    @Override
    public void stop() {
        System.out.println("stopped at 1 sec.");
    }
}
