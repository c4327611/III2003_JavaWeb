<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
    <%
    String x = request.getParameter("x");
	String y = request.getParameter("y");
	int r = Integer.parseInt(x) + Integer.parseInt(y);
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>UTF8.</title>
</head>
<body>
<%= x %> +
<%= y %> =
<%= r %>
</body>
</html>