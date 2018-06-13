package factory_method;

public class BusFactory extends Factory{
    @Override
    public Auto createAuto() {
        return new Bus();
    }
}
