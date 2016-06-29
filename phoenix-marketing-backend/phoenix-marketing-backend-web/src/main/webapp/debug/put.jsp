<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Debug Page Put</title>
</head>
<body>
	
Server Info: <%  out.println(request.getLocalAddr() + " : " + request.getLocalPort()+"<br/>");%>

<%
    session.setAttribute("current.time", new java.util.Date());
%>

put time: The time is <%= session.getAttribute("current.time") %>
</body>
</html>