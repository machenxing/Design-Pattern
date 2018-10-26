package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * InvocationHandler方式实现动态代理（JDK动态代理）
 *
 */
public class TransactionHandler1 implements InvocationHandler {

    private Object target;

    public TransactionHandler1(Object target) {
        this.target = target;
    }

    /**
     * @param proxy 参数是Object类型，是真实的实现类对象
     * @param method 参数是Method类型，代表调用的方法
     * @param args 参数是Object类型，代表的是调用方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启事务控制。。。");
        Object result = method.invoke(target, args);
        System.out.println("关闭事务控制。。。");
        return result;
    }

    public static void main(String[] args) {
        Object target = new UserDaoImpl();
        TransactionHandler1 handler = new TransactionHandler1(target);
        UserDao userDao = (UserDao) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        userDao.save();
    }
}
