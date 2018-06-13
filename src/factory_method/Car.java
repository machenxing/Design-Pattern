package factory_method;

public class Car extends Auto{
    public Car(){
        this.setName("½Î³µ");
    }

    @Override
    public void run() {
        System.out.println("Æô¶¯"+this.getName());
    }
}
