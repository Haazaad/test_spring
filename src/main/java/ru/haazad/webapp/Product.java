package ru.haazad.webapp;

public class Product {
    private final Long id;
    private final String title;
    private final Float cost;

    public Product(Long id, String title, Float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
