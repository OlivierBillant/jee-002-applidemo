<%@page import="fr.eni.javaee.module4.messages.LecteurMessage"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.javaee.module4.bo.Avis"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter un avis</title>
</head>
<body>

	<%
		Avis avis = (Avis)request.getAttribute("avis");
		if(avis!=null)
		{
	%>
			<p style="color:red;">L'avis a été ajouté avec succès :</p>
			<p><%=avis %></p>
	<%	
		} 
	%>
	
	<%
		List<Integer> listeCodesErreur = (List<Integer>)request.getAttribute("listeCodesErreur");
		if(listeCodesErreur!=null)
		{
	%>
			<p style="color:red;">Erreur, l'avis n'a pas pu être ajouté :</p>
	<%
			for(int codeErreur:listeCodesErreur)
			{
	%>
				<p><%=LecteurMessage.getMessageErreur(codeErreur)%></p>
	<%	
			}
		}
	%>
	<form action="<%=request.getContextPath()%>/modules/module4/ServletAjoutAvis" method="post">
		<label for="idDescription">Description : </label><input type="text" id="idDescription" name="description" value="<%=listeCodesErreur!=null?request.getParameter("description"):""%>"/>
		<br/>
		<label for="idNote">Note : </label><input type="text" id="idNote" name="note" value="<%=listeCodesErreur!=null?request.getParameter("note"):""%>"/>
		<br/>
		<input type="submit" value="Valider"/>
	</form>
	<a href="./demonstrations/demonstration2.html">Retour</a>
</body>
</html>