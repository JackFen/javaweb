<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/13
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    1.	值为null值的时候
    request.setAttribute("emptyNull",null);
//    2.	值为空串的时候
    request.setAttribute("emptyStr","");
//    3.	值是Object类型数组，长度为零的时候
    request.setAttribute("emptyArr",new Object[]{});
//    4.	Map集合，元素个数为零
    Map<String,Object>map=new HashMap<String, Object>();
    request.setAttribute("emptyMap",map);
//    5.list集合，元素个数为零
    List<String>list=new ArrayList<>();
    request.setAttribute("emptyList",list);
%>
${empty emptyNull}<br/>
${empty emptyStr}<br/>
${empty emptyArr}<br/>
${empty emptyList}<br/>
${empty emptyMap}<br/>
</body>
</html>
