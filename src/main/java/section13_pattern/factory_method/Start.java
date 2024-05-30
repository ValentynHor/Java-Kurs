package section13_pattern.factory_method;

public class Start {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar(RoadType.GRASS);
        car1.drive();

    }
}
