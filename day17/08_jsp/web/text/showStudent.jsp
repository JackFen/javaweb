<%@ page import="java.util.List" %>
<%@ page import="Package.pojo.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/12
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            border:1px black solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,tr{
            border:1px black solid;
        }
    </style>
</head>
<body>
<%--练习二：jsp输出一个表格，里面有10个学生信息--%>
<%
   List<Student> studentList=(List<Student>)request.getAttribute("stuList");
%>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>电话</td>
    </tr>
    <%for(Student student:studentList){%>
    <tr>
        <td><%=student.getId()%></td>
        <td><%=student.getName()%></td>
        <td><%=student.getAge()%></td>
        <td><%=student.getPhone()%></td>
    </tr>
<%}%>
</table>
</body>
</html>
