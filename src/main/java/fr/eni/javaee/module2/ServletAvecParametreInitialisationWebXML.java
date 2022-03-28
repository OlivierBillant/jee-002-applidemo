package fr.eni.javaee.module2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAvecParametreInitialisationWebXML
 */
public class ServletAvecParametreInitialisationWebXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String valeurParametre;
	
	
    @Override
    public void init() throws ServletException {
    	this.valeurParametre=this.getInitParameter("NOM_PARAMETRE");
    	super.init();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("NOM_PARAMETRE = ").append(this.valeurParametre);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
