package abstractFactory;

import abstractFactory.dao.proudct.ProductDao;
import abstractFactory.dao.userInfo.UserInfoDao;
import abstractFactory.factory.DaoFactory;
import abstractFactory.factory.MySqlDaoFactory;
import abstractFactory.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws IOException {
        DaoFactory factory = null;

        FileInputStream fis = new FileInputStream("db.properties");

        Properties properties = new Properties();

        properties.load(fis);

        String dbtype = properties.getProperty("DBTYPE");

        //USER 생성
        User user =  new User("userA", 20);

        //product 생성
        Product product = new Product("product", 10);

        //factory 생성
        if (dbtype.equals("MYSQL")){
            factory = new MySqlDaoFactory();
        }else if (dbtype.equals("ORACLE")){
            factory = new OracleDaoFactory();
        }else {
            System.out.println("error........");
        }

        UserInfoDao userInfoDao = factory.createUserInfoDao();
        ProductDao productDao = factory.createProductDao();

        userInfoDao.addUser(user);
        userInfoDao.removeUser(user);
        userInfoDao.updateUser(user);

        productDao.addProduct(product);
        productDao.removeProduct(product);
        productDao.updateProduct(product);



    }
}
