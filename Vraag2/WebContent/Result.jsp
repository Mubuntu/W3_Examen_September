<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="edu.ap.json.JSONFactory"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultaat</title>
</head>
<body>
<%
		String search = request.getParameter("searchTerm");
String alleProducten="";
		if (search != null){
	%>
		<h1>Gevonden product </h1>
	<%
		String gevondenProduct = JSONFactory.getProduct(search);
	%>
		<p><%=gevondenProduct%></p>
	<%
		
		} else{
			 alleProducten = JSONFactory.allProducts();
		}
		
	%>
	
		<%= search %>
		<br><br>
		<%=alleProducten %>
	<a href="Input.jsp">Back to Search</a>
</body>
</html>