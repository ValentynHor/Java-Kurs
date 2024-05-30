package section13_pattern.observer;

public class Listener1 implements Listener {

    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}
