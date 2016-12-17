<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
 <jsp:useBean id="member" class="tw.j2ee.Member"/>
 <jsp:setProperty property="id" name="member" value="002"/>
 <jsp:setProperty property="name" name="member" value="${param.name}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>UTF8.</title>
</head>
<body>
Welcome,
<jsp:getProperty property="name" name="member"/>
<hr>
Welcome,${member.name}
<hr>
Welcome,${member["name']}

</body>
</html>