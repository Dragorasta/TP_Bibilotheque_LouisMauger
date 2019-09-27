package fr.cesi.bibliotheque.model;

import java.util.List;

import fr.cesi.bibliotheque.dao.UtilisateurDao;

public class Administrateur {
	private Long id ;
	private String nom = "" ;
	private String prenom  = "" ;
	private String identifiant  = "" ;
	private String mdp  = "" ;
	private Boolean rang ;
	
	public Administrateur(Long unId, String unNom, String unPrenom,String unIdentifiant, String unMdp, Boolean unRang) {
		this.id = unId ;
		this.nom = unNom ;
		this.prenom = unPrenom ;
		this.identifiant = unIdentifiant ;
		this.mdp = unMdp ;
		this.rang = unRang ;
	}
	
	public Long getId() {
		return id;
	}
	public void setISBN(Long unId) {
		this.id = unId;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public String getPrenomAuteur() {
		return prenom;
	}
	public void setPrenomAuteur(String unPrenom) {
		this.prenom = unPrenom;
	}
	
	public Boolean getNomAuteur() {
		return rang;
	}
	
	public void setNomAuteur(Boolean unRang) {
		this.rang = unRang;
	}
}
