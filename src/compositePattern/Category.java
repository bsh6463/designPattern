package compositePattern;

import java.util.ArrayList;

public class Category extends ProductCategory{

    ArrayList<ProductCategory> list;

    public Category(int id, String name, int price) {
        super(id, name, price);
        list = new ArrayList<>();
    }

    @Override
    public void addProductCategory(ProductCategory productCategory) {
        list.add(productCategory);
    }

    @Override
    public void removeProductCategory(ProductCategory productCategory) {
        for (ProductCategory temp : list) {
            if (temp.getId() == productCategory.getId()){
                list.remove(temp.id);
                return;
            }
            System.out.println("상품이 없음");
        }
    }

    @Override
    public int getProductCount() {
        int count = 0;
        for (ProductCategory temp : list) {
            count += temp.getProductCount();
        }
        return count;
    }

    @Override
    public int getProductPrice() {
        int price = 0;
        for (ProductCategory temp : list) {
            price += temp.getProductPrice();
        }
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
