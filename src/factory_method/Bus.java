package factory_method;

public class Bus extends Auto {
    public Bus(){
        this.setName("��ʿ");
    }

    @Override
    public void run() {
        System.out.println("����"+this.getName());
    }
}
