package section13_pattern.facade;

public class CarFacade {

    private Door door = new Door();
    private Ignition ignition = new Ignition();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        ignition.fire();
        wheel.turn();
    }
}
