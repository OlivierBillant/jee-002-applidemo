<h3>Voici les informations lues dans le fichier fragmentIncluAvecBaliseInclude.jsp</h3>
<p>

<%
	String bonjour = "bonjour tout le monde";
%>
	<%=bonjour %>
</p>

<%--<%=variableUtiliseeDansFragment%>Erreur de compilation--%>

<p>
	Lecture du paramètre "parametre" :
	<%=request.getParameter("parametre") %>
</p>

<p>
	Lecture de l'attribut "attribut" :
	<%=request.getAttribute("attribut") %>
</p>