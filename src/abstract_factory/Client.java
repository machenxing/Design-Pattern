package abstract_factory;

public class Client {
    public static void main(String[] args) {
        ComponentFactory factory;
        Button button;
        Scroll scroll;

        factory=new WindowsComponentFactory();
        button=factory.createButton();
        scroll=factory.creaScroll();

        button.show();
        scroll.show();

        factory=new MotifComponentFactory();
        button=factory.createButton();
        scroll=factory.creaScroll();

        button.show();
        scroll.show();
    }
}
