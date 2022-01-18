<%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/17
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/15_filter/loginservlet" method="get">
    用户名：<input type="text" name="username" value="${cookie.username.value}"><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
