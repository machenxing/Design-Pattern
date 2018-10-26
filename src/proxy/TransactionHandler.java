package proxy;

/**
 * 静态代理
 */
public class TransactionHandler implements UserDao {

    private UserDaoImpl target;

    public TransactionHandler(UserDaoImpl target){
        this.target = target;
    }

    @Override
    public void save() {
         System.out.println("开启事务控制。。。");
         target.save();
         System.out.println("关闭事务控制。。。");
     }

    public static void main(String[] args) {
        UserDaoImpl target = new UserDaoImpl();
        UserDao userDao = new TransactionHandler(target);
        userDao.save();
    }
}
