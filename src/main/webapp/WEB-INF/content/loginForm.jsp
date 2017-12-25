<%--
  Created by IntelliJ IDEA.
  User: wengchuqin
  Date: 2017/12/25
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h3>登陆页面</h3>
<form action="login.action" method="post">
    <font color="red">${requestScope.message}</font>
    <table>
        <tr>
            <td>登录名</td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登陆"></td>
        </tr>
    </table>
</form>
</body>
</html>
