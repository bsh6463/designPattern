package abstractFactory.dao.userInfo;

import abstractFactory.User;

public class OracleUserInfoDao implements UserInfoDao{


    @Override
    public void addUser(User user) {
        System.out.println("add user to Oracle");
    }

    @Override
    public void removeUser(User user) {
        System.out.println("remove user from Oracle");
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user to Oracle");
    }
}
