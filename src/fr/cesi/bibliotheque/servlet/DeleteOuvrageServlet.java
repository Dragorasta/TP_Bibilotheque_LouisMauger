package fr.cesi.bibliotheque.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cesi.bibliotheque.dao.OuvrageDao;
import fr.cesi.bibliotheque.model.Ouvrage;
import fr.cesi.bibliotheque.model.UnknownOuvrageException;

/**
 * Servlet implementation class DeleteOuvrageServlet
 */
@WebServlet("/DeleteOuvrageServlet")
public class DeleteOuvrageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOuvrageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long isbn = new Long(request.getParameter("isbn"));  
		try {
			OuvrageDao.removeOuvrage(isbn);
		} catch (UnknownOuvrageException e) {
			
		}
		  
		  request.setAttribute("ouvrages", OuvrageDao.getAllOuvrages());
		  
		  RequestDispatcher rd = request.getRequestDispatcher("/listOuvrage.jsp");
	      rd.forward(request, response);
	}

}
