package factory_method;

public class Car extends Auto{
    public Car(){
        this.setName("�γ�");
    }

    @Override
    public void run() {
        System.out.println("����"+this.getName());
    }
}
