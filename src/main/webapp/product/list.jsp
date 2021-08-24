<%--
  Created by IntelliJ IDEA.
  User: dhnam
  Date: 8/23/2021
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name Product</td>
        <td>Color</td>
        <td>Price</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getColor()}</td>
            <td>${product.getPrice()}</td>
            <td><a href="products?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="products?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>