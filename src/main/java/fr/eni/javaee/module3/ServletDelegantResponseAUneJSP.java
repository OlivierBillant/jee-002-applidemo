package fr.eni.javaee.module3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDelegantResponseAUneJSP
 */
@WebServlet("/modules/module3/ServletDelegantResponseAUneJSP")
public class ServletDelegantResponseAUneJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=null;
		//rd = request.getRequestDispatcher("/WEB-INF/modules/module3/demonstrations/premiereJSPDansWEB-INF.jsp");
		//rd=this.getServletContext().getRequestDispatcher("/modules/module3/demonstrations/secondePremiereJSP");
		rd = this.getServletContext().getNamedDispatcher("premiereJSPDansWEB_INF");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
