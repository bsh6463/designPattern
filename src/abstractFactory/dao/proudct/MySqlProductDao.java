package abstractFactory.dao.proudct;

import abstractFactory.Product;

public class MySqlProductDao implements ProductDao{
    @Override
    public void addProduct(Product product) {
        System.out.println("add product to MySQL");
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("remove product from MySQL");
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update product to MySql");
    }
}
