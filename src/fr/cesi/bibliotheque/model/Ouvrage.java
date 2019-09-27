package fr.cesi.bibliotheque.model;

public class Ouvrage {
	private Long isbn ;
	private String nom = "" ;
	private String prenomAuteur  = "" ;
	private String nomAuteur  = "" ;
	private String genre  = "" ;
	
	
	public Ouvrage(Long unISBN, String unNom, String unPrenomAuteur, String unNomAuteur, String unGenre) {
		this.isbn = unISBN ;
		this.nom = unNom ;
		this.prenomAuteur = unPrenomAuteur ;
		this.nomAuteur = unNomAuteur ;
		this.genre = unGenre ;
	}


	public Long getISBN() {
		return isbn;
	}
	public void setISBN(Long unISBN) {
		this.isbn = unISBN;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public String getPrenomAuteur() {
		return prenomAuteur;
	}
	public void setPrenomAuteur(String unPrenomAuteur) {
		this.prenomAuteur = unPrenomAuteur;
	}
	
	public String getNomAuteur() {
		return nomAuteur;
	}
	
	public void setNomAuteur(String unNomAuteur) {
		this.nomAuteur = unNomAuteur;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setAuteur(String unGenre) {
		this.genre = unGenre;
	}
}