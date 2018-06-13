package abstract_factory;

public class WindowsComponentFactory extends ComponentFactory {
    @Override
    public Scroll creaScroll() {
        return new WindowsScroll();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
