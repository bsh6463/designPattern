package abstractFactory.factory;

import abstractFactory.dao.proudct.OracleProductDao;
import abstractFactory.dao.proudct.ProductDao;
import abstractFactory.dao.userInfo.OracleUserInfoDao;
import abstractFactory.dao.userInfo.UserInfoDao;

public class OracleDaoFactory implements DaoFactory{

    @Override
    public UserInfoDao createUserInfoDao() {
        return new OracleUserInfoDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new OracleProductDao();
    }
}
