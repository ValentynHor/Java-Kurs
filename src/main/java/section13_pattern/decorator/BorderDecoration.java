package section13_pattern.decorator;

public class BorderDecoration extends Decorator{
    public BorderDecoration(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...added border");

    }
}
