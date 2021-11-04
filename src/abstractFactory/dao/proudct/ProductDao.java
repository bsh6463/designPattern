package abstractFactory.dao.proudct;

import abstractFactory.Product;

public interface ProductDao {

    void addProduct(Product product);
    void removeProduct(Product product);
    void updateProduct(Product product);
}
