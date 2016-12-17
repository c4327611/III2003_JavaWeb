<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
    <jsp:directive.page import="tw.j2ee.Member" />
    <% Member member  = new Member();
   member.setId("003");member.setName("John");
   %>
   <%! int j; %>
   <jsp:declaration>
   int i;
   String name;
   </jsp:declaration>
   
   <jsp:scriptlet>
   name="Cliff";
   </jsp:scriptlet>
   <%  %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>UTF8.</title>
</head>
<body>
Welcome, <%member.getName(); %><br>
<%= i++ %>
<%= j++ %>

</body>
</html>