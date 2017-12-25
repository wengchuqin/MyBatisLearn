<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wengchuqin
  Date: 2017/12/25
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>allBooks</title>
</head>
<body>
    <h3>欢迎，${sessionScope.user.username}</h3>

    <table>
        <tr>
            <th>书名</th>
            <th>价格</th>
        </tr>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.name}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
