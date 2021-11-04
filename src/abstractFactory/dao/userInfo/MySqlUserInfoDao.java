package abstractFactory.dao.userInfo;

import abstractFactory.User;

public class MySqlUserInfoDao implements UserInfoDao{


    @Override
    public void addUser(User user) {
        System.out.println("add user to MySQL");
    }

    @Override
    public void removeUser(User user) {
        System.out.println("remove user from MySQL");
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user to MySQL");
    }
}
