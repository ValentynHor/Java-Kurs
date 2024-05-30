package section13_pattern.decorator;

public class TextView implements Component{
    @Override
    public void draw() {
        System.out.println("text view");
    }
}
