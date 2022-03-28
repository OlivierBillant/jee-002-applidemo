package fr.eni.javaee.module4.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.module4.BusinessException;
import fr.eni.javaee.module4.bll.AvisManager;
import fr.eni.javaee.module4.bo.Avis;

/**
 * Servlet implementation class ServletAjoutAvis
 */
@WebServlet("/modules/module4/ServletAjoutAvis")
public class ServletAjoutAvis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAjoutAvis() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/modules/module4/demonstrations/ajoutAvis.jsp");
		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String description;
		int note;
		try
		{
			description = request.getParameter("description");
			note= Integer.parseInt(request.getParameter("note"));
			AvisManager avisManager = new AvisManager();
			Avis avis = avisManager.ajouter(description, note);
			request.setAttribute("avis", avis);
		}
		catch(NumberFormatException e)
		{
			List<Integer> listeCodesErreur=new ArrayList<>();
			listeCodesErreur.add(CodesResultatServlets.FORMAT_AVIS_NOTE_ERREUR);
			request.setAttribute("listeCodesErreur",listeCodesErreur);
		} catch (BusinessException e) {
			request.setAttribute("listeCodesErreur", e.getListeCodesErreur());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/modules/module4/demonstrations/ajoutAvis.jsp");
		rd.forward(request, response);
	}

}
