<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.03.2021
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.internetStoreBasedOnSetvlets.ProductElements.ListOfFakeProducts" %>
<%!
    public String getIndexedProdInfo(int i,ListOfFakeProducts prodList)
    {
        return "<tr><td>" + i + "</td><td>" + prodList.get(i).getProdName() + "</td> <td>" +
                prodList.get(i).getProdPrice() + "</td> <td>" + prodList.get(i).getProdAmount() + "</td><td>" +
                "<form action=\"buyServlet\" method=\"post\">" +
                "<label for=\"amount\">Amount: </label>" +
                "<input type=\"number\" name=\"amount\" step=\"1\" min=\"1\" max=" + prodList.get(i).getProdAmount() +"\" value=\"1\"/>" +
                "<input type=\"submit\" value=\"Order\"> <br/>" +
                "<input type=\"hidden\" name=\"prodIndex\" value=\"" + i + "\">" +
                "</form>" +
                "</td></tr>";
    }
%>
<html>
<head>
    <title>Store</title>
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

    <div>
    <table>
        <tr><td>#</td><td>Name</td> <td>Price</td> <td>Amount left</td></tr>
        <%
            ListOfFakeProducts prodList = ListOfFakeProducts.getInstance();
            for(int i = 0; i < prodList.getSize(); i++) {
                out.println(getIndexedProdInfo(i, prodList));
            }
        %>
    </table>
    </div>

</body>
</html>