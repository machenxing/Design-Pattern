package observer;

public class TV implements IObserver {
    @Override
    public void update(Subject subject, Object args) {
        System.out.println("TV���������Ϣ ["+args+"]");
    }
}
