package section13_pattern.state;

public class FireState implements TransformerState{
    @Override
    public void action() {
        System.out.println("fire");
    }
}
