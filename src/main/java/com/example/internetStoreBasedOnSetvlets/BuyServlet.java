package com.example.internetStoreBasedOnSetvlets;

import com.example.internetStoreBasedOnSetvlets.ProductElements.ListOfChosenElements;
import com.example.internetStoreBasedOnSetvlets.ProductElements.ListOfFakeProducts;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ()
public class BuyServlet extends HttpServlet {
    ListOfFakeProducts prodList = ListOfFakeProducts.getInstance();
    ListOfChosenElements cartList = ListOfChosenElements.getInstance();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        workingWithBuyData(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        workingWithBuyData(req, resp);
    }

    private void workingWithBuyData(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        int prodIndex = Integer.parseInt(req.getParameter("prodIndex"));
        int amountBought = Integer.parseInt(req.getParameter("amount"));

        if(prodList.getAmount(prodIndex) >= amountBought)
        {
            // substracting from store list
            prodList.setAmount(prodIndex, (prodList.get(prodIndex).getProdAmount() - amountBought));
            // adding to cart list
            cartList.addToCart(prodList.get(prodIndex).getProdName(), prodList.get(prodIndex).getProdPrice(), amountBought);


            resp.sendRedirect("storePage.jsp");
        }
        else
        {
            resp.sendRedirect("storePage.jsp");
        }

        System.out.println(amountBought);
        System.out.println(prodIndex);







        //forwardMethod(resp);
    }

    private void forwardMethod(HttpServletResponse resp)throws IOException
    {
        resp.sendRedirect("storePage.jsp");
    }

}
