<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	//déclarations
	private int nombreAppel;
	private int getNombreAppel()
	{
		return this.nombreAppel;
	}
	private void setNombreAppel(int nombreAppel)
	{
		this.nombreAppel=nombreAppel;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Présentation des éléments de script</title>
</head>
<body>
	<%
		//scriptlets
		this.setNombreAppel(this.getNombreAppel()+1);
	%>
	
	Nombre d'appel de la JSP :
	<input type="text" value="<%=this.getNombreAppel()%>"/>
	<a href="presentationElementsDeScript.jsp">Actualiser</a>
	<a href="demonstration4.html">Retour</a>
</body>
</html>








