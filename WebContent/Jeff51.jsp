<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8" %>
<% 
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	int result = 0;
	if (x != null){
		Integer intX = Integer.parseInt(x);
		Integer intY = Integer.parseInt(y);
		result = intX + intY;
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>X+Y=?</title>
</head>
<body>
<form>
	<input type="text" name="x" />
	+
	<input type="text" name="y" />
	<input type="submit" value="="/>
	
	<%= result %>
</form>

</body>
</html>