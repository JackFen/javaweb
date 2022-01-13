<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/13
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String,Object> map=new HashMap<String, Object>();
    map.put("a.a.a","aaaValue");
    map.put("b+b+b","dsdadas");
    request.setAttribute("map",map);
%>
${map['a.a.a']}<br/>
</body>
</html>
