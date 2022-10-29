import product.Product;
import product.ProductSet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        System.out.println("Часть1. Задание 1:");
        ProductSet productSet = new ProductSet();


        productSet.addProduct(new Product("апельсины", 120.50f, 1.5f));
        productSet.addProduct(new Product("мандарины", 100, 1.5f));
        productSet.addProduct(new Product("яблоки", 80, 1.5f));
        //productSet.addProduct(new Product("апельсины", 120, 1)); // Товар уже находится в списке (наборе)
        productSet.addProduct(new Product("картофель", 40, 10));

        System.out.println(Arrays.toString(productSet.getProduct().toArray()));

        productSet.delProduct(new Product("картофель"));
        System.out.println(Arrays.toString(productSet.getProduct().toArray()));

        for (Product product : productSet.getProduct()) {
            product.buyProduct();
        }
        System.out.println(Arrays.toString(productSet.getProduct().toArray()));

        for (Product product : productSet.getProduct()) {
            //product.buyProduct(); // Товар мандарины уже куплен
            break;
        }

    }
}