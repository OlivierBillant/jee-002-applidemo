<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Affichage d'un attribut d'application</title>
</head>
<body>
	<p>
		Voici la valeur de l'attribut d'application attributDApplication :
		<%=application.getAttribute("attributDApplication") %>
	</p>
	<a href="demonstrations/demonstration4.html">Retour à la page d'accueil de la démonstration</a>
</body>
</html>