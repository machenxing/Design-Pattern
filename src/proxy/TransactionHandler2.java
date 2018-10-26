package proxy;

/*import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

*//**
 * CGLIB方式实现动态代理（Spring使用这种方式实现）
 *
 *//*
public class TransactionHandler2 implements MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy)throws Throwable{
        System.out.println("开启事务控制。。。");
        Object result = methodProxy.invokeSuper(target,args);
        System.out.println("关闭事务控制。。。");
        return result;
    }

    public static void main(String[] args) {
        TransactionHandler2 cglibProxy = new TransactionHandler2();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDaoImpl.class);
        enhancer.setCallback(cglibProxy);

        UserDao userDao = (UserDao)enhancer.create();
        userDao.save();
    }
}*/
