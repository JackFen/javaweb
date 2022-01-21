<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %><%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/21
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //从请求头中获取Locale信息
    Locale locale =null;
    String country=request.getParameter("country");
    if ("cn".equals(country)){
        locale=locale.CHINA;
    }
    else if ("us".equals(country)){
        locale=locale.US;
    }
    else {
        locale=request.getLocale();
    }
    //获取资源包（根据
    ResourceBundle i18n = ResourceBundle.getBundle("i18n", locale);%>
<a href="i18n.jsp?country=cn">中文</a>
<a href="i18n.jsp?country=us">English</a>
<center>
    <h1><%=new String(i18n.getString("regist").getBytes("ISO-8859-1"),"UTF-8")%></h1>
    <table>
        <form>
            <tr>
              <td><%=new String(i18n.getString("username").getBytes("ISO-8859-1"),"UTF-8")%></td>
              <td><input name="username" type="text"></td>
            </tr>
            <tr>
                <td><%=new String(i18n.getString("password").getBytes("ISO-8859-1"),"UTF-8")%></td>
                <td><input type="password"></td>
            </tr>
            <tr>
                <td><%=new String(i18n.getString("sex").getBytes("ISO-8859-1"),"UTF-8")%></td>
                <td><input type="radio" name="sex"><%=new String(i18n.getString("boy").getBytes("ISO-8859-1"),"UTF-8")%>
                    <input type="radio" name="sex"><%=new String(i18n.getString("girl").getBytes("ISO-8859-1"),"UTF-8")%></td>
            </tr>
            <tr>
                <td><%=new String(i18n.getString("email").getBytes("ISO-8859-1"),"UTF-8")%></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td colspan="2"align="center">
                    <input type="reset" value="<%=new String(i18n.getString("reset").getBytes("ISO-8859-1"),"UTF-8")%>">
                    <input type="submit" value="<%=new String(i18n.getString("submit").getBytes("ISO-8859-1"),"UTF-8")%>">
                </td>
            </tr>
        </form>
    </table>
</center>
</body>
</html>
