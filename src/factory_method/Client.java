package factory_method;

public class Client {
    public static void main(String[] args) {
        Auto auto1=StaticFactory.createAuto(1);
        auto1.run();
        Auto auto2=StaticFactory.createAuto(2);
        auto2.run();
        Auto auto3=StaticFactory.createAuto(3);
        auto3.run();
    }
}
