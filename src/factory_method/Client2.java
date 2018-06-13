package factory_method;

public class Client2 {
    public static void main(String[] args) {
        Factory factory;
        Auto auto;

        factory=new CarFactory();
        auto=factory.createAuto();
        auto.run();

        factory=new BusFactory();
        auto=factory.createAuto();
        auto.run();

        factory=new TruckFactory();
        auto=factory.createAuto();
        auto.run();
    }
}
