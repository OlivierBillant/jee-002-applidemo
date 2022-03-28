<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page affichant une voiture</title>
</head>
<body>
	<h1>Cette page affiche une voiture avec l'Expression Language si elle a été créée</h1>
	
	<a href="">Rafraîchir</a>
	<p>
		Remarquez l'absence de valeurs nulles si la voiture n'est pas créée.
	</p>
	
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
	
	<a href="demonstrations/demonstration3.html">Retour</a>
</body>
</html>