package product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductSet {
    Set<Product> productSet = new HashSet<>();

    public float getProductSummCost() {
        float summCost = 0;
        for (Product prod : productSet) {
            summCost += prod.getCost();
        }
        return summCost;
    }

    public void addProduct(Product product) {
        if (productSet.contains(product)) {
            throw new RuntimeException("Товар уже находится в списке (наборе)");
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

    @Override
    public String toString() {
        return Arrays.toString(productSet.toArray());
    }
}
