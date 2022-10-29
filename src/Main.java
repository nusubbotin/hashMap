import product.Product;
import product.ProductSet;
import recipe.Recipe;
import recipe.RecipeSet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    private static void task3() {
        System.out.println("Часть2. Задание 2:");
        IntSet intSet = new IntSet();

        System.out.println(intSet);
        intSet.delNotEven();
        System.out.println(intSet);

    }

    private static void task2() {
        System.out.println("Часть2. Задание 1:");
        RecipeSet recipeSet = new RecipeSet();

        ProductSet productSet1 = new ProductSet();
        productSet1.addProduct(new Product("апельсины", 120.50f, 1.5f));
        productSet1.addProduct(new Product("мандарины", 100, 1.5f));

        recipeSet.addRecipe(new Recipe("Тропический салат", productSet1));

        ProductSet productSet2 = new ProductSet();
        productSet2.addProduct(new Product("картофель", 40, 10));
        productSet2.addProduct(new Product("огурцы", 60, 3));
        recipeSet.addRecipe(new Recipe("Овощной салат", productSet2));
        System.out.println(recipeSet);

        //recipeSet.addRecipe(new Recipe("Тропический салат", productSet2)); //Такой рецепт уже существует

    }

    /*private static void task1() {
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
    }*/
}