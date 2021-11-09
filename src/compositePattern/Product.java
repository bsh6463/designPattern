package compositePattern;

public class Product extends ProductCategory{

    public Product(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public void addProductCategory(ProductCategory productCategory) {
        //Product가 사용 안함
    }

    @Override
    public void removeProductCategory(ProductCategory productCategory) {
        //Product가 사용 안함
    }

    @Override
    public int getProductCount() {
        return 1;
    }

    @Override
    public int getProductPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
