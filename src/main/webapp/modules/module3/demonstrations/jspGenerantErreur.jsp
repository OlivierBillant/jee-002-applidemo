<%@ page language="java" 
		contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"
    	isErrorPage="false"
    	errorPage="jspTraitantErreur.jsp"
    	%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Une pâge avec une erreur qui ne s'affichera jamais</title>
</head>
<body>
	<%
	
		String maVariable=null;
		maVariable.length();//NullPointerException
	%>
</body>
</html>