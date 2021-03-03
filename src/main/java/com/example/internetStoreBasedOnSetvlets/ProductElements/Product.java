package com.example.internetStoreBasedOnSetvlets.ProductElements;

public class Product {
    private String prodName;
    private int prodPrice;
    private int prodAmount = 10;

    public Product(String name, int price, int amount)
    {
        this.prodName = name;
        this.prodPrice = price;
        this.prodAmount = amount;
    }

    public String getProdName() {
        return prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public int getProdAmount() {
        return prodAmount;
    }

    public void setProdAmount(int amount)
    {
        this.prodAmount = amount;
    }
}
