package abstractFactory.factory;

import abstractFactory.dao.proudct.MySqlProductDao;
import abstractFactory.dao.proudct.ProductDao;
import abstractFactory.dao.userInfo.MySqlUserInfoDao;
import abstractFactory.dao.userInfo.UserInfoDao;

public class MySqlDaoFactory implements DaoFactory{

    @Override
    public UserInfoDao createUserInfoDao() {
        return new MySqlUserInfoDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new MySqlProductDao();
    }
}
