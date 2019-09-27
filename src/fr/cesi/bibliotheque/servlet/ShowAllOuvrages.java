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
 * Servlet implementation class ShowAllProducts
 */
@WebServlet("/ShowAllOuvrages")
public class ShowAllOuvrages extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllOuvrages() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OuvrageDao dao = new OuvrageDao();
        List<Ouvrage> ouvrages = OuvrageDao.getAllOuvrages();
        System.out.println(ouvrages);
        request.setAttribute("ouvrages",ouvrages );
        RequestDispatcher rd = request.getRequestDispatcher("/listOuvrage.jsp");
        rd.forward(request, response);
    }
/**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * Product p1 = new Product(new Long(1), "ballon de foot", "pour jouer au foot",
         * 15.0) ; Product p2 = new Product(new Long(2), "raquette de tennis",
         * "pour jouer au tennis", 50.0) ; Product p3 = new Product(new Long(3),
         * "gants", "pour le ski", 75.0) ; List<Product> produits = new
         * ArrayList<Product>(); produits.add(p1); produits.add(p2); produits.add(p3);
         */

        OuvrageDao dao = new OuvrageDao();
        List<Ouvrage> ouvrages = OuvrageDao.getAllOuvrages();
        System.out.println(ouvrages);
        request.setAttribute("ouvrages",ouvrages );
        RequestDispatcher rd = request.getRequestDispatcher("/listOuvrage.jsp");
        rd.forward(request, response);
    }

}