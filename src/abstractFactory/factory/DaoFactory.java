package abstractFactory.factory;

import abstractFactory.dao.proudct.ProductDao;
import abstractFactory.dao.userInfo.UserInfoDao;

public interface DaoFactory {

    UserInfoDao createUserInfoDao();
    ProductDao createProductDao();

}
