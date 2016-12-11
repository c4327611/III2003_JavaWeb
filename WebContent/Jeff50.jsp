<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JEFF company</title>
</head>
<body>
<%
	int lottery = (int)(Math.random()*49+1);
	out.print(lottery);
%>
<hr />
<%= Calendar.getInstance().get(Calendar.YEAR) %>
<hr />
<% int a=0; %>
<%! int b=0; %>

a= <%= a++ %><br>
b= <%= b++ %><br>
</body>
</html>