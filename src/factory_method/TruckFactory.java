package factory_method;

public class TruckFactory extends Factory{
    @Override
    public Auto createAuto() {
        return new Truck();
    }
}
