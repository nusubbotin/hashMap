package product;

import java.util.Objects;

public class Product {
    private String name;
    private float cost;
    private float count;
    private boolean alreadyBought = false;

    public Product(String name) {
        this(name, 100, 1);
    }

    public Product(String name, float cost, float count) {
        setName(name);
        setCost(cost);
        setCount(count);
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public float getCount() {
        return count;
    }

    public boolean isAlreadyBought() {
        return alreadyBought;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Название не может быть пустым. Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            throw new IllegalArgumentException("Цена должен быть положительным числом");
        }else {
            this.cost = cost;
        }
    }

    public void setCount(float count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Количество должен быть положительным числом");
        }else {
            this.count = count;
        }
    }

    public void buyProduct() {
        if (!alreadyBought){
            alreadyBought = true;
            System.out.println("Продукт " + name + " купили");
        }else {
            throw new IllegalArgumentException("Товар "+ name +" уже куплен");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", count=" + count +
                ", alreadyBought=" + alreadyBought +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
