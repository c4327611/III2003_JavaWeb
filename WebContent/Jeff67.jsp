<%@page import="java.util.LinkedList"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>UTF8.</title>
</head>
<body>
<%
String[] names = {"Jeff","Jason","Steve"};
request.setAttribute("names", names);
%>
Name 1 :${urname[0]};<br>
Name 2 :${urname[1]};<br>
Name 3 :${urname[2]};<br>
<hr>
<%
HashMap<String,String> data = new HashMap<>();
data.put("name","Jeff");
data.put("passwd","12345");
data.put("gender","male");
%>
User: ${data["name"] }<br>
Password: ${data["passwd"] }<br>
Gender: ${data["gender"] }<br>
<hr>
<% 
LinkedList<String> list = new LinkedList<>();
list.add("AAA");
list.add("BBB");
list.add("CCC");
request.setAttribute("list", list);
%>
List 1 : ${list[param.i]}



</body>
</html>