package singleton;
/*
"懒汉式"单例模式
*/
public class SingletonLazyLoad {
    private static SingletonLazyLoad singleton;
    private SingletonLazyLoad(){

    }
    public static synchronized SingletonLazyLoad getInstance(){
        if(singleton==null)
            singleton=new SingletonLazyLoad();
        return singleton;
    }
}
