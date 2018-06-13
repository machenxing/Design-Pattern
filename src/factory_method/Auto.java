package factory_method;

public abstract class Auto {
    private String name;
    public abstract void run();
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
