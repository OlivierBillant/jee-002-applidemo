<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cette page est composée d'éléments inclus</title>
</head>
<body>
	<%@ include file="entete.html" %>
	
	<%
		int variableUtiliseeDansFragment=123;
	%>
	<%@ include file="fragmentIncluAvecDirectiveInclude.jspf" %>
	
	
	<%
		request.setAttribute("attribut", variableUtiliseeDansFragment);
	%>
	
	<jsp:include page="/WEB-INF/modules/module6/fragmentIncluAvecBaliseInclude.jsp">
		<jsp:param value="<%=variableUtiliseeDansFragment %>" name="parametre"/>
	</jsp:include>
	
	<%@ include file="piedDePage.html"%>
</body>
</html>