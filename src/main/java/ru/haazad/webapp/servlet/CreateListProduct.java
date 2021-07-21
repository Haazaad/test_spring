package ru.haazad.webapp.servlet;

import ru.haazad.webapp.Product;

import java.util.ArrayList;
import java.util.List;

public class CreateListProduct {
    private final List<Product> productList;

    public CreateListProduct() {
        productList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            productList.add(new Product((long) i, "First", Float.parseFloat(i + "." + i)));
        }

    }

    public String getProductList() {
        return productList.toString();
    }
}
