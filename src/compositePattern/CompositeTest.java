package compositePattern;

public class CompositeTest {

    public static void main(String[] args) {

        ProductCategory womanCategory = new Category(1234, "woman", 0);
        ProductCategory manCategory = new Category(5678, "man", 0);

        ProductCategory clothesCategoryW = new Category(2345, "clothes", 0);
        ProductCategory bagCategoryW = new Category(3456, "bag", 0);
        ProductCategory shoesCategoryW = new Category(9876, "shoes", 0);

        womanCategory.addProductCategory(clothesCategoryW);
        womanCategory.addProductCategory(bagCategoryW);
        womanCategory.addProductCategory(shoesCategoryW);

        ProductCategory clothesCategoryM = new Category(23450, "clothes", 0);
        ProductCategory bagCategoryM = new Category(34560, "bag", 0);
        ProductCategory shoesCategoryM = new Category(98760, "shoes", 0);

        manCategory.addProductCategory(clothesCategoryM);
        manCategory.addProductCategory(bagCategoryM);
        manCategory.addProductCategory(shoesCategoryM);

        ProductCategory shoes1 = new Product(121, "nike", 10000);
        ProductCategory shoes2 = new Product(122, "adidas", 20000);
        ProductCategory shoes3 = new Product(123, "gucci", 30000);
        ProductCategory shoes4 = new Product(124, "balenciaga", 40000);
        ProductCategory shoes5 = new Product(125, "prada", 50000);
        ProductCategory shoes6 = new Product(126, "bally", 60000);

        shoesCategoryW.addProductCategory(shoes1);
        shoesCategoryW.addProductCategory(shoes2);
        shoesCategoryW.addProductCategory(shoes3);

        shoesCategoryM.addProductCategory(shoes4);
        shoesCategoryM.addProductCategory(shoes5);
        shoesCategoryM.addProductCategory(shoes6);

        ProductCategory bag1 = new Product(121, "HERMES", 500000);
        ProductCategory bag2 = new Product(122, "LOUISVUITTON", 500000);
        ProductCategory bag3 = new Product(123, "GUCCI", 500000);
        ProductCategory bag4 = new Product(124, "BALENCIA", 500000);
        ProductCategory bag5 = new Product(125, "PRADA", 500000);
        ProductCategory bag6 = new Product(126, "MULBERRY", 500000);

        bagCategoryW.addProductCategory(bag1);
        bagCategoryW.addProductCategory(bag2);
        bagCategoryW.addProductCategory(bag3);

        bagCategoryM.addProductCategory(bag4);
        bagCategoryM.addProductCategory(bag5);
        bagCategoryM.addProductCategory(bag6);

        System.out.println(womanCategory.getProductCount());
        System.out.println(womanCategory.getProductPrice());
        System.out.println(manCategory.getProductCount());
        System.out.println(manCategory.getProductPrice());



    }
}
