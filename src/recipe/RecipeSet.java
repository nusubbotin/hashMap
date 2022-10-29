package recipe;

import product.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RecipeSet {
    Set<Recipe> recipes = new HashSet<>();

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void addRecipe(Recipe recipe) {
        for (Recipe r : recipes) {
            if (r.equals(recipe)) {
                throw new RuntimeException("Такой рецепт уже существует");
            }
        }
        recipes.add(recipe);
        System.out.println("Рецепт " +recipe.getName()+" добавлен. Общее количество рецептов в наборе: "+recipes.size());
    }

    @Override
    public String toString() {
        return Arrays.toString(recipes.toArray());
    }
}
