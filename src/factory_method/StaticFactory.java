package factory_method;

public class StaticFactory {
    public static Auto createAuto(int autoId){
        switch(autoId){
            case 1:
                return new Car();
            case 2:
                return new Bus();
            case 3:
                return new Truck();
            default:
                throw new RuntimeException("没有这种车型！");
        }
    }
}
