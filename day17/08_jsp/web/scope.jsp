<%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/12
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>scope.jsp页面</h1>
<%
    //往四个域都分别存数据
    pageContext.setAttribute("key","pageContext");
    request.setAttribute("key","request");
    session.setAttribute("key","session");
    application.setAttribute("key"," application");
%>
<%--<%--%>
    <%--request.getRequestDispatcher("/scope2.jsp").forward(request,response);--%>
<%--%>--%>
<%--<jsp:forward page="/scope2.jsp"></jsp:forward> 是请求转发标签，它的功能就是请求转发 page属性设置请求转发的路径--%>
<jsp:forward page="/scope2.jsp"></jsp:forward>
</body>
</html>
