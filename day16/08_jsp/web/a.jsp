<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/11
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
errorPage="/error-500.jsp"%>
<%--
errorPage表示错误后自动跳转的路径
这个路径一般都是以斜杠打头，它表示请求地址为http://ip:port/工程路径/映射到代码的web目录
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是一个jsp页面<br/>
<%--1.申明类属性--%>
<%!
    private Integer id;
    private String name;
    private static Map<String,Object>map;
%>
<%--2.申明static静态代码块--%>
<%!
    static {
        map = new HashMap<String, Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
    }
%>
<%--3.申明类方法--%>
<%!
    public int abc(){
        return 12;
    }
%>
<%--4.申明内部类--%>
<%!
    public static class A{
        private Integer id=12;
        private String abc="abc";
    }
%>
<%--1.输出整型--%>
<%=12%><br/>
<%--2.输出浮点型--%>
<%=12.12%><br/>
<%--3.输出字符串--%>
<%="我是字符串"%><br/>
<%--4.输出对象--%>
<%=map%><br/>
<%--1.代码脚本  if语句--%>
<%
    int i=12;
    if(i==12){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
%>
<%--2.代码脚本   for循环--%>
<%
    for (int j=0;j<10;j++)
    {
        System.out.println(j);
    }
%>
<%--3.翻译java文件中_jspService方法内的代码块都可以写--%>
<%
    String username = request.getParameter("username");
    System.out.println("用户名的请求参数是："+username);
%>
<%--这是jsp注释--%>
</body>
</html>
