package observer;

import java.util.Vector;

public abstract class Subject {
    private static final ChangeManager changeManager=ChangeManager.getInstance();
    public static ChangeManager getChangeManager(){
        return changeManager;
    }
    /*
    ���Ӽ�����
    */
    public void addObserver(IObserver observer){
        getChangeManager().register(this,observer);
    }
    /*
    �Ƴ�������
    */
    public void removeObserver(IObserver observer){
        getChangeManager().unregister(this,observer);
    }
    /*
    ֪ͨ����
    */
    public void notify(Object args){
        getChangeManager().notifyBySubject(this,args);
    }
/*    private Vector<IObserver> observers;

    public Subject(){
        observers=new Vector<IObserver>();
    }

    public synchronized void addObserver(IObserver observer){
        observers.add(observer);
    }

    public synchronized void removeObserver(IObserver observer){
        observers.remove(observer);
    }

    public synchronized void removeObservers(){
        observers.clear();
    }
    public synchronized void notifyObservers(Object args){
        for(IObserver observer:observers){
            observer.update(this,args);
        }
    }*/
}
