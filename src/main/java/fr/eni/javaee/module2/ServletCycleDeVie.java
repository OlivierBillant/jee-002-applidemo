package fr.eni.javaee.module2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCycleDeVie
 */
@WebServlet("/modules/module2/ServletCycleDeVie")
public class ServletCycleDeVie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int nombrePassageInit=0;
	private int nombreAppelServlet=0;
	private int nombreDestruction=0;
    
	
	@Override
	public void init() throws ServletException {
		this.nombrePassageInit+=1;
		super.init();
	}
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.nombreAppelServlet+=1;
		response.getWriter().append("nombreAppelServlet :").append(String.valueOf(this.nombreAppelServlet));
		response.getWriter().append(System.lineSeparator());
		response.getWriter().append("nombrePassageInit :").append(String.valueOf(this.nombrePassageInit));
		response.getWriter().append(System.lineSeparator());
		response.getWriter().append("nombreDestruction :").append(String.valueOf(this.nombreDestruction));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		this.nombreDestruction+=1;
		super.destroy();
	}

}
