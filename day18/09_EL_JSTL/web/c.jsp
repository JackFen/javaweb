<%@ page import="Package.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: fengzhanwei
  Date: 2022/1/13
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName("jack");
    person.setPhone(new String[]{"123","456","789"});
    List<String> cities=new ArrayList<String>();
    cities.add("北京");
    cities.add("上海");
    cities.add("深圳");
    person.setCities(cities);
    Map<String,Object> map=new HashMap<>();
    map.put("key1","value1");
    map.put("key2","value2");
    map.put("key3","value3");
    person.setMap(map);
    pageContext.setAttribute("person",person);
%>
输出Person:${person}<br/>
输出Person的name属性：${person.name}<br/>
输出Person的phones数组属性值：${person.phone[0]}<br/>
输出Person的cities集合中的元素值：${person.cities[0]}<br/>
输出person的map集合：${person.map}<br/>
输出person的map集合中某个key的值：${person.map.key1}<br/>
</body>
</html>
