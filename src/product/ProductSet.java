package product;

import java.util.HashSet;
import java.util.Set;

public class ProductSet {
    Set<Product> productSet = new HashSet<>();


    public Set<Product> getProduct() {
        return productSet;
    }

    public void addProduct(Product product) {
        for (Product prod : productSet) {
            if (prod.equals(product)) {
                throw new RuntimeException("Товар уже находится в списке (наборе)");
            }
        }
        productSet.add(product);
    }
    public void delProduct(Product product){
        for (Product prod : productSet) {
            if (prod.equals(product)) {
                product = prod;
                break;
            }
        }

        productSet.remove(product);
        System.out.println("Продукт "+ product.getName() + " удален из списка. Число продуктов: "+ productSet.size());
    }
}
