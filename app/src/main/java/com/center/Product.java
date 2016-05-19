package com.center;

/**
 * Created by apple on 16/5/13.
 */
public class Product {
    private String name;
    private int price;
    private int sell;
    private String discription;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int price, int sell, String discription) {
        this.name = name;
        this.price = price;
        this.sell = sell;
        this.discription = discription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
