<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>99</title>
</head>
<body>
<table border='1' width='100%'>
<tr>
<% 
	for (int k=0;k<4;k++){
	out.print("<tr>");
	for(int j=2;j<5;j++){
		int newj = j + k * 4;
		if ((j+k)%2==0){
			out.print("<td bgcolor='green'>");
		}else{
			out.print("<td bgcolor='yellow'>");
		}
		for (int i = 1; i <= 9; i++) {
			int r = newj * i;
			out.print(newj + " x " + i + " = " + r + "<br />");
			
		}
	out.print("</td>");
	}
	out.print("</tr>");
	}
	
%>
</tr>
</table>

</body>
</html>