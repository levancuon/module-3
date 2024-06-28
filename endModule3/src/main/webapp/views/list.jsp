<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/7/2024
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách sách</h2>
<form action="">
    <table>
        <tr>
            <td>Mã sách</td>
            <td>Tên sách</td>
            <td>Tác giả</td>
            <td>Số lượng</td>
            <td>Mô tả</td>
            <td></td>
        </tr>
        <c:forEach var="bookLists" items="${bookList}">
            <tr>
                <td>${bookLists.book_id}</td>
                <td>${bookLists.book_name}</td>
                <td>${bookLists.author}</td>
                <td>${bookLists.description}</td>
                <td>${bookLists.quantity}</td>
                <td><a href="/admin/create" >Mượn</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
