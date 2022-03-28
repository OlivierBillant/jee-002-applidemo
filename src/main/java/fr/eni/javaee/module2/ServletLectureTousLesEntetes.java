package fr.eni.javaee.module2;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLectureTousLesEntetes
 */
@WebServlet("/modules/module2/ServletLectureTousLesEntetes")
public class ServletLectureTousLesEntetes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer sb = new StringBuffer();
		
		String userAgent = request.getHeader("user-agent");
		sb.append("User-Agent : ").append(userAgent).append(System.lineSeparator());
		
		Enumeration<String> listeEntetes= request.getHeaderNames();
		while(listeEntetes.hasMoreElements())
		{
			String entete = listeEntetes.nextElement();
			sb.append(entete+" : ");
			Enumeration<String> valeurs = request.getHeaders(entete);
			while(valeurs.hasMoreElements())
			{
				sb.append(valeurs.nextElement());
				if(valeurs.hasMoreElements())
				{
					sb.append(", ");
				}
			}
			sb.append(System.lineSeparator());
		}
		
		response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
