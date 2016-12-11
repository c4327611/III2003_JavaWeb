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
application.setAttribute("x", 123);
request.setAttribute("x", (int)(Math.random()*49+1));

String x = request.getParameter("x");
request.getParameter("x");
Integer intx = (Integer)request.getAttribute("x");
out.print(x+"<br>");
out.print(intx+"<br>");
%>
<a href='Brad56.jsp'>Jeff56</a>
</body>
</html>