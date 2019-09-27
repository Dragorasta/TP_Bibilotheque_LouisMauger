package fr.cesi.bibliotheque.model;

public class UnknownOuvrageException extends Exception{
	public UnknownOuvrageException(Long id) {
		super("L'ouvrage avec l'id =" + id + " n'existe pas.");
	}
}
