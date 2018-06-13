package singleton;
/*
"����ʽ"����ģʽ
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
