package section13_pattern.decorator;

public class Window implements Component{

    @Override
    public void draw() {
        System.out.println("windows draw");
    }
}
