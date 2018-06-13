package observer;

import java.util.Hashtable;
import java.util.Vector;

public class ChangeManager {
    private static final ChangeManager cm=new ChangeManager();

    private static Hashtable<Subject,Vector<IObserver>> map
            =new Hashtable<Subject,Vector<IObserver>>();

    private ChangeManager(){

    }
    public static ChangeManager getInstance(){
        return cm;
    }
    /*
    * 注册监听器
    * */
    public synchronized void register(Subject subject,IObserver observer){
        Subject key=subject;
        Vector<IObserver> observers=null;

        if(map.containsKey(key))    observers=map.get(key);
        if(observers==null)     observers=new Vector<IObserver>();
        if(!observers.contains(observer))   observers.add(observer);
        map.put(key,observers);
    }
    /*
    解除监听器注册
    */
    public synchronized void unregister(Subject subject,IObserver observer){
        map.get(subject).remove(observer);
    }
    /*
    根据特定主题通知监听器
    */
    public synchronized void notifyBySubject(Subject subject,Object args){
        for(IObserver observer:map.get(subject)){
            observer.update(subject, args);
        }
    }

}
