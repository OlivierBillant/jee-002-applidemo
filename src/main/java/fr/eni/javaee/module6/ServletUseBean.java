package fr.eni.javaee.module6;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.module6.bo.Voiture;

/**
 * Servlet implementation class ServletUseBean
 */
@WebServlet("/modules/module6/ServletUseBean")
public class ServletUseBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random();
		if(random.nextBoolean())
		{
			Voiture voiture = new Voiture("RENAULT","ZOE","AA123BB",5236);
			request.setAttribute("voiture", voiture);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/modules/module6/pageUseBean.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
