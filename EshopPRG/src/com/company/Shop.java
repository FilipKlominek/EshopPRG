package com.company;

import java.util.ArrayList;

public class Shop {
    private final String name;
    private ArrayList<Product> products;
    private int sales;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getSales() {
        return sales;
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void sell(Product product) {
        products.remove(product);
        this.sales += product.getPrice();
    }

    public int getSumOfPrices() {
        int sum = 0;
        for (int i = 0; i < this.getProducts().size(); i++) {
            sum += this.getProducts().get(i).getPrice();
        }
        return sum;
    }
}
