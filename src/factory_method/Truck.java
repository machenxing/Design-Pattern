package factory_method;

public class Truck extends Auto{
    public Truck(){
        this.setName("����");
    }

    @Override
    public void run() {
        System.out.println("����"+this.getName());
    }
}
