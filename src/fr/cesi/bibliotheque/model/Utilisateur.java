package fr.cesi.bibliotheque.model;

import java.util.ArrayList;
import java.util.List;

import fr.cesi.bibliotheque.dao.UtilisateurDao;

public class Utilisateur {
	private Long id ;
	private String nom = "" ;
	private String prenom = "" ;
	private String mail  = "" ;
	private String motdepasse = "";
	private Boolean rang ;
	
	
	public Utilisateur(Long unId, String unNom, String unPrenom, String unMail, String unMotDePasse, Boolean unRang) {
		this.id = unId ;
		this.nom = unNom ;
		this.prenom = unPrenom ;
		this.mail = unMail ;
		this.motdepasse = unMotDePasse ;
		this.rang = unRang ;
	}


	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}
	public void setId(Long unId) {
		this.id = unId;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String unPrenom) {
		this.prenom = unPrenom;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String unMail) {
		this.mail = unMail;
	}
	
	public String getMotDePasse() {
		return motdepasse;
	}
	public void setMotDePasse(String unMotDePasse) {
		this.motdepasse = unMotDePasse;
	}
	
	public Boolean getRang() {
		return rang;
	}
	
	public List<Utilisateur> createJeuEssai(){
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		Utilisateur u1 = new Utilisateur (1L, "Louis",  "Louis",  "Louis",  "Louis", true);
		utilisateurs.add(u1) ;
	return utilisateurs;
	}
}