package prototype;

public class SampleClass implements Prototype {
    private int i;
    public int getI(){
        return i;
    }
    public void setI(int i){
        this.i=i;
    }
    public SampleClass(int i){
        super();
        this.i=i;
    }

    @Override
    public Prototype clone() {
        return new SampleClass(this.getI());
    }

    @Override
    public String toString() {
        return Integer.toString(this.getI());
    }
}
