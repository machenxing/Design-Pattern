package abstract_factory;

public class WindowsScroll extends Scroll {
    public WindowsScroll(){
        super();
        this.setLookAndFeel("Windows");
    }
}
