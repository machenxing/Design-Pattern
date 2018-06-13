package factory_method;

public class Bus extends Auto {
    public Bus(){
        this.setName("∞Õ ø");
    }

    @Override
    public void run() {
        System.out.println("∆Ù∂Ø"+this.getName());
    }
}
