package fr.cesi.bibliotheque.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cesi.bibliotheque.dao.OuvrageDao;
import fr.cesi.bibliotheque.model.Ouvrage;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddOuvrageServlet")
public class AddOuvrageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOuvrageServlet() {
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
		  Long isbn = new Long(request.getParameter("isbnOuv"));
		  String nom = (String)request.getParameter("nomOuv");
		  String nomAuteur =(String)request.getParameter("nomAuteurOuv");
		  String prenomAuteur =(String)request.getParameter("prenomAuteurOuv");
		  String genre =(String)request.getParameter("genreOuv");
		 
		  Ouvrage ouvrage = new Ouvrage(isbn, nom, nomAuteur, prenomAuteur, genre);
		  OuvrageDao.addOuvrage(ouvrage);
		  
		  request.setAttribute("ouvrages", OuvrageDao.getAllOuvrages());
		  
		  RequestDispatcher rd = request.getRequestDispatcher("/listOuvrage.jsp");
	      rd.forward(request, response);
	}

}
