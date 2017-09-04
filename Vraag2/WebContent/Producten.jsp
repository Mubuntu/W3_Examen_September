<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="edu.ap.json.JSONFactory" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	JSONFactory parser = new JSONFactory();
	String result = parser.allProducts();
%>
<h2>Producten</h2>
<%=result %>
<br><br>
	<a href="Input.jsp">Back to Search</a>

</body>
</html>