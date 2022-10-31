package recipe;

import product.Product;
import product.ProductSet;

import java.util.Objects;

public class Recipe {
    private String name;
    private ProductSet productSet;
    private float summCost = 0;

    public Recipe(String name, ProductSet productSet) {
        this.name = name;
        this.productSet = productSet;
        summCost = productSet.getProductSummCost();

    }

    public String getName() {
        return name;
    }

    public ProductSet getProductSet() {
        return productSet;
    }

    public float getSummCost() {
        return summCost;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", productSet=" + productSet +
                ", summCost=" + summCost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
