<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>Error!</title>
</head>
<body>
Error Page:<br>
<%= exception.printStackTrace(new PrintWriter(out))%>

</body>
</html>