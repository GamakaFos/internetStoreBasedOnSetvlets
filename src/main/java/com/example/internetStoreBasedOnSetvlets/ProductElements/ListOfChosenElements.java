package com.example.internetStoreBasedOnSetvlets.ProductElements;

import java.util.ArrayList;
import java.util.List;

public class ListOfChosenElements {
    private static ListOfChosenElements instance;
    private List<Product> cartList = new ArrayList<>();

    private ListOfChosenElements(){}
    public static ListOfChosenElements getInstance()
    {
        if(instance == null)
        {
            instance = new ListOfChosenElements();
        }
        return instance;
    }

    public List<Product> getProdArray()
    {
        return cartList;
    }

    public void addToCart(String name, int price, int newAmount)
    {
        // adding new product to cart
        if(checkProdInCart(name))
        {
            cartList.add(new Product(name, price, newAmount));
        }
        else // adding new amount to existing prod in cart
        {
            cartList.get(findProdInCart(name)).setProdAmount(cartList.get(findProdInCart(name)).getProdAmount() + newAmount);
        }
    }

    public int getSize()
    {
        return cartList.size();
    }

    public Product get(int index) {
        return cartList.get(index);
    }


    // check if there is already a product in out list
    private boolean checkProdInCart(String name)
    {
        for(int i = 0; i < cartList.size(); i++)
        {
            if(name.equals(cartList.get(i).getProdName()))
                return false;
        }
        return true;
    }

    // if product is in our list and we want to add more amount we get index
    private int findProdInCart(String name)
    {
        for(int i = 0; i < cartList.size(); i++)
        {
            if(name.equals(cartList.get(i).getProdName()))
                return i;
        }
        return 0;
    }
}
