package factory_method;

public class Truck extends Auto{
    public Truck(){
        this.setName("¿¨³µ");
    }

    @Override
    public void run() {
        System.out.println("Æô¶¯"+this.getName());
    }
}
