package com.example.internetStoreBasedOnSetvlets.ProductElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOfFakeProducts{
    private static ListOfFakeProducts instanse;
    private List<Product> productList = new ArrayList<Product>();
    Random rand = new Random();

    //uslovnaya baza dannih
    private ListOfFakeProducts() {
        productList.add(new Product("Tomatos", 23, rand.nextInt(10) + 10));
        productList.add(new Product("Carrots", 15, rand.nextInt(10) + 10));
        productList.add(new Product("Sosages", 67, rand.nextInt(10) + 10));
        productList.add(new Product("Plates", 150, rand.nextInt(10) + 10));
        productList.add(new Product("Booze", 90, rand.nextInt(10) + 10));
        productList.add(new Product("Empty boxes", 9, rand.nextInt(10) + 10));
        productList.add(new Product("Pipes", 70, rand.nextInt(10) + 10));
        productList.add(new Product("Cats", 10000000, rand.nextInt(10) + 10));
    }

    public static ListOfFakeProducts getInstance()
    {
        if(instanse == null)
        {
            instanse = new ListOfFakeProducts();
        }
        return instanse;
    }

    public void setAmount(int prodIndex, int newAmount)
    {
        productList.get(prodIndex).setProdAmount(newAmount);
    }

    public int getAmount(int index)
    {
        return productList.get(index).getProdAmount();
    }

    public Product get(int index) {
        return productList.get(index);
    }

    public int getSize()
    {
        return productList.size();
    }


}
