package fr.eni.javaee.module2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLectureURL
 */
@WebServlet("/modules/module2/ServletLectureURL")
public class ServletLectureURL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String protocole = request.getScheme();
		String nomServeur=request.getServerName();
		int port=request.getServerPort();
		String nomApplication=request.getContextPath();
		String cheminRessource = request.getServletPath();
		
		StringBuffer sb = new StringBuffer();
		sb.append("Protocole : ").append(protocole).append(System.lineSeparator());
		sb.append("Nom du serveur : ").append(nomServeur).append(System.lineSeparator());
		sb.append("Port : ").append(port).append(System.lineSeparator());
		sb.append("Nom application : ").append(nomApplication).append(System.lineSeparator());
		sb.append("Chemin ressource : ").append(cheminRessource).append(System.lineSeparator());
		
		response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
