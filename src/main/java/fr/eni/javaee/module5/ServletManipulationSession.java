package fr.eni.javaee.module5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletManipulationSession
 */
@WebServlet("/modules/module5/ServletManipulationSession")
public class ServletManipulationSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int compteurAccesPendantSession=0;
		if(session.getAttribute("compteurAcces")!=null)
		{
			compteurAccesPendantSession=(int)session.getAttribute("compteurAcces");
		}
		compteurAccesPendantSession+=1;
		session.setAttribute("compteurAcces", compteurAccesPendantSession);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/modules/module5/afficherSession.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
