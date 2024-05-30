package section13_pattern.state;

public class MoveState implements TransformerState{
    @Override
    public void action() {
        System.out.println("move");
    }
}
