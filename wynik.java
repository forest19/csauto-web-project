package pl.javastart.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class wynik
 */
@WebServlet("/wynik")
public class wynik extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String[] size = request.getParameterValues("size");
		String cos = request.getParameter("cos");
		request.setAttribute("size", size);
		request.setAttribute("cos", cos);
		request.getRequestDispatcher("rezultat.jsp").forward(request, response);;
		
	}

}
