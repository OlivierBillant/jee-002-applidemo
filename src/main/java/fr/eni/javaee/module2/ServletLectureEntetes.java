package fr.eni.javaee.module2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLectureEntetes
 */
@WebServlet("/modules/module2/ServletLectureEntetes")
public class ServletLectureEntetes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String methode = request.getMethod();
		String locale = request.getLocale().toString();
		
		StringBuffer sb = new StringBuffer();
		sb.append("Méthode : ").append(methode).append(System.lineSeparator());
		sb.append("Locale : ").append(locale).append(System.lineSeparator());
		response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
