<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page affichant une voiture</title>
</head>
<body>
	<h1>Cette page affiche une voiture avec l'Expression Language et les balises JSTL si elle a été créée</h1>
	
	<a href="">Rafraîchir</a>
	
	<h2>Affichage ou non d'une voiture</h2>
	
	<c:if test="${!empty voiture }">
		<ul>
			<li>
				Marque : ${requestScope['voiture'].marque}
			</li>
			<li>
				Modèle : ${requestScope.voiture.modele}
			</li>
			<li>
				Immatriculation : ${voiture.immatriculation}
			</li>
			<li>
				Kilométrage : ${voiture.kilometrage}
			</li>
		</ul>
	</c:if>
	<c:if test="${empty voiture }">
		<p>La voiture n'existe pas.</p>
	</c:if>
	
	<h2>Affichage d'une liste de voitures</h2>
	
	<p>Il y a ${voitures.size()} voitures.</p>
	
	<ol>
		<c:forEach var="v" items="${voitures}">
			<li>
				${v.toString()}
			</li>
		</c:forEach>
	</ol>
	
	<a href="demonstrations/demonstration4.html">Retour</a>
</body>
</html>











