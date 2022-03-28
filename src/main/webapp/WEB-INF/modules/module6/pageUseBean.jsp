<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page affichant une voiture</title>
</head>
<body>
	<h1>Cette page affiche une voiture avec les balises JSP si elle a été créée</h1>
	
	<a href="">Rafraîchir</a>
	
	<jsp:useBean id="voiture"
				 scope="request"
				 class="fr.eni.javaee.module6.bo.Voiture"
	></jsp:useBean>
	
	<ul>
		<li>
			Marque : <jsp:getProperty property="marque" name="voiture"/>
		</li>
		<li>
			Modèle : <jsp:getProperty property="modele" name="voiture"/>
		</li>
		<li>
			Immatriculation : <jsp:getProperty property="immatriculation" name="voiture"/>
		</li>
		<li>
			Kilométrage : <jsp:getProperty property="kilometrage" name="voiture"/>
		</li>
	</ul>
	
	<a href="demonstrations/demonstration2.html">Retour</a>
</body>
</html>