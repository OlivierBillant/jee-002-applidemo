<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Une JSP affichant l'information fournie par la servlet</title>
</head>
<body>
	<%
		String uneVariable = (String) request.getAttribute("uneCle");
	%>
	
	L'information fournie par la servlet est :<%=uneVariable %>
	
	<a href="<%=request.getContextPath()%>/modules/module3/demonstrations/demonstration6.html">Retour</a>
</body>
</html>