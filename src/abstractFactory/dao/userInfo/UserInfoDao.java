package abstractFactory.dao.userInfo;

import abstractFactory.User;

public interface UserInfoDao {

   void addUser(User user);
   void removeUser(User user);
   void updateUser(User user);
}
