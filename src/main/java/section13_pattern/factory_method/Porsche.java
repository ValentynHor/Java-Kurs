package section13_pattern.factory_method;

public class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("330km/h");
    }

    @Override
    public void stop() {
        System.out.println("stopped at 1 sec.");

    }
}
