package abstract_factory;

public class MotifComponentFactory extends ComponentFactory {
    @Override
    public Scroll creaScroll() {
        return new MotifScroll();
    }

    @Override
    public Button createButton() {
        return new MotifButton();
    }
}
