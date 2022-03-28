<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Affichage du contenu de la session</title>
</head>
<body>
	
	<%
		if(session.getAttribute("compteurAcces")!=null)
		{
			int compteurAccess = (int)session.getAttribute("compteurAcces");
	%>
			<p>Nombre d'accès : <%=compteurAccess%></p>
	<%
		}
		else
		{
	%>
			<p>Le compteur d'accès n'existe pas en session</p>
	<%		
		}
	%>
	
	<p>
		Avec le lien suivant, le suivi de session n'est assuré que si les cookies sont autorisés :
		<a href="<%=request.getContextPath()%>/modules/module5/ServletManipulationSession">ServletManipulatationSession (sans réécriture d'URL)</a>
	</p>
	
	<p>
		Avec le lien suivant, le suivi de session est assuré même si les cookies sont refusés :
		<a href="<%=response.encodeURL(request.getContextPath()+"/modules/module5/ServletManipulationSession")%>">ServletManipulatationSession (avec réécriture d'URL)</a>
	</p>
	
	<p>
		<a href="demonstrations/demonstration3.html">Retour à la page d'accueil de la démonstration</a>
	</p>
</body>
</html>