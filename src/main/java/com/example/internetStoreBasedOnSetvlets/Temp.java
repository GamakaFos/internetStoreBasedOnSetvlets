package com.example.internetStoreBasedOnSetvlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import com.example.internetStoreBasedOnSetvlets.ProductElements.ListOfChosenElements;
import com.example.internetStoreBasedOnSetvlets.ProductElements.Product;
import com.example.internetStoreBasedOnSetvlets.Temp;

public class Temp extends HttpServlet {
    ListOfChosenElements cartList = ListOfChosenElements.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        workingWithDisplayingCartData(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        workingWithDisplayingCartData(req, resp);
    }

    private void workingWithDisplayingCartData(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        PrintWriter writer = resp.getWriter();

        System.out.println("List of cart products");
        for(int i = 0; i < cartList.getSize(); i++)
        {
            System.out.println("Prod name - > " + cartList.get(i).getProdName() + " prod price - > " + cartList.get(i).getProdPrice() + " prod in cart - > " + cartList.get(i).getProdAmount());
        }

    }

}
