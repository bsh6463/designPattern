package abstractFactory.dao.proudct;

import abstractFactory.Product;

public class OracleProductDao implements ProductDao{
    @Override
    public void addProduct(Product product) {
        System.out.println("add product to Oracle");
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("remove product from Oracle");
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update product to Oracle");
    }
}
