package section13_pattern.factory_method;

public class CarFactory {

    public static Car getCar(RoadType road) {
        return switch (road) {
            case CITY -> new Porsche();
            case OFF_ROAD -> new Jeep();
            case GRASS -> new NewJeep();
        };

    }
}
