package observer;

public class Customer implements IObserver {
    @Override
    public void update(Subject subject, Object args) {
        System.out.println("Customer���������Ϣ ["+args+"]");
    }
}
