package abstract_factory;

public class WindowsButton extends Button {
    public WindowsButton(){
        super();
        this.setLookAndFeel("Windows");
    }
}
