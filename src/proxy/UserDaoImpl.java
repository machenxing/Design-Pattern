package proxy;

import proxy.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("正在保存用户信息。。。");
    }
}
