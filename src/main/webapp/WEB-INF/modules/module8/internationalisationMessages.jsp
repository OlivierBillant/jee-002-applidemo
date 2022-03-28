<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Internationalisation des messages</title>
</head>
<body>
	<c:if test="${!empty param.langue }">
		<!-- Définition de la locale à utiliser -->
		<fmt:setLocale value="${param.langue}"/>
	</c:if>
	<p>
		<!-- Définition diu fichier ressource à utiliser -->
		<fmt:bundle basename="fr.eni.javaee.module8.mes_messages">
			<fmt:message key="msg_bonheur"></fmt:message>
		</fmt:bundle>
	</p>
	
	<p>
		<fmt:setBundle basename="fr.eni.javaee.module8.mes_messages"
						var="r"
		/>
		<fmt:message key="msg_bonjour" bundle="${r}">
			<fmt:param value="${param.nom}"></fmt:param>
		</fmt:message>
	</p>
	<p>
		<a href="demonstrations/demonstration1.html">Retour</a>
	</p>
</body>
</html>



