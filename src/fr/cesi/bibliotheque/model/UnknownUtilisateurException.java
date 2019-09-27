package fr.cesi.bibliotheque.model;

public class UnknownUtilisateurException extends Exception{
	public UnknownUtilisateurException(Long id) {
		super("L'utilisateur avec l'id =" + id + " n'existe pas.");
	}
}
