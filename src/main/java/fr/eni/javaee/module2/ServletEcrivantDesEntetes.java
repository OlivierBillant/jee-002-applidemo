package fr.eni.javaee.module2;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEcrivantDesEntetes
 */
@WebServlet("/modules/module2/ServletEcrivantDesEntetes")
public class ServletEcrivantDesEntetes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setStatus(HttpServletResponse.SC_OK);
		response.setLocale(Locale.FRENCH);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("MON_ENTETE", "MA VALEUR");
		
		response.getWriter().append("Des en-têtes ont été écrits");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
