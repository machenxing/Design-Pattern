package factory_method;

public class CarFactory extends Factory{
    @Override
    public Auto createAuto() {
        return new Car();
    }
}
