<%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/15
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/09_EL_JSTL/uploadservlet" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="username"/><br/>
    头像:<input type="file" name="photo"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
