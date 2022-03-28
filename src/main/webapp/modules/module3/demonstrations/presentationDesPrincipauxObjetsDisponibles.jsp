<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Présentations des principaux objets disponibles</title>
</head>
<body>
	<h1>request</h1>
	
	<p><%=request.getContextPath() %></p>
	
	<h1>response</h1>
	
	<p>
		<%=response.getStatus() %>
	</p>
	
	<h1>out</h1>
	
	<p>
		<%
			out.print("Bonjour");
		%>
	</p>
	
	<a href="<%=request.getContextPath()%>/modules/module3/demonstrations/demonstration5.html">Retour</a>
</body>
</html>




