<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.03.2021
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.internetStoreBasedOnSetvlets.ProductElements.ListOfChosenElements" %>
<%!
    public String getIndexedProdInfo(int i,ListOfChosenElements prodList)
    {
        return "<tr><td>" + i + "</td><td>" + prodList.get(i).getProdName() + "</td> <td>" +
                prodList.get(i).getProdPrice() + "</td> <td>" + prodList.get(i).getProdAmount() + "</td>";
    }

    public int totalCost(ListOfChosenElements prodList)
    {
        int totalPrice = 0;
        for(int i = 0; i < prodList.getSize(); i++)
        {
            totalPrice += (prodList.get(i).getProdPrice() * prodList.get(i).getProdAmount());
        }
        return totalPrice;
    }
%>
<html>
<head>
    <title>Cart page</title>
    <meta charset=utf-8>
    <style>
        td{
            width: 120px;
            height:120px;
            border: solid 1px silver;
            text-align:center;
        }
    </style>
</head>
<body>
<jsp:include page="homeHeader.html"/>
<table>
    <tr><td>#</td><td>Name</td> <td>Price/ Total price -> <%= totalCost(ListOfChosenElements.getInstance()) %></td> <td>Amount left</td></tr>
    <%
        ListOfChosenElements prodList = ListOfChosenElements.getInstance();
        for(int i = 0; i < prodList.getSize(); i++) {
            out.println(getIndexedProdInfo(i, prodList));
        }
    %>
</table>

</body>
</html>
