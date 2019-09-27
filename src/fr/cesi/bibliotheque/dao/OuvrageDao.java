package fr.cesi.bibliotheque.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.cesi.bibliotheque.model.Utilisateur;
import fr.cesi.bibliotheque.model.Ouvrage;
import fr.cesi.bibliotheque.model.UnknownOuvrageException;
import fr.cesi.bibliotheque.model.UnknownUtilisateurException;


public class OuvrageDao {
	
	private static List<Ouvrage> ouvrages = new ArrayList<Ouvrage>();
	private static Long idSequence = 1L;
	
	public OuvrageDao() { }
	
	
	public static void addOuvrage(Ouvrage ouvrage) {
		ouvrage.setISBN(idSequence++);
		ouvrages.add(ouvrage);
	}
	
	
	public static void updateOuvrage(Ouvrage ouvrage) throws UnknownOuvrageException {
		int index = getOuvrageIndexById(ouvrage.getISBN());
		if(index > -1) {
			ouvrages.set(index, ouvrage);
		} else {
			throw new UnknownOuvrageException(ouvrage.getISBN());
		}
	}
	
	
	public static Ouvrage findOuvrageById(Long id) throws UnknownOuvrageException {
		int index = getOuvrageIndexById(id);
		if(index > -1) {
			Ouvrage ouvrage = ouvrages.get(index);
			return ouvrage;
		}
		throw new UnknownOuvrageException(id);
	}
	
	
	public static List<Ouvrage> getAllOuvrages() {
		return Collections.unmodifiableList(ouvrages);
	}
	
	
	public static void removeOuvrage(Ouvrage ouvrage) throws UnknownOuvrageException {
		removeOuvrage(ouvrage.getISBN());
	}
	
	
	public static void removeOuvrage(Long id) throws UnknownOuvrageException {
		int index = getOuvrageIndexById(id);
		if(index > -1) {
			ouvrages.remove(index);
		} else {
			throw new UnknownOuvrageException(id);
		}
	}
	
	private static int getOuvrageIndexById(Long id) {
		for (int i = 0; i < ouvrages.size(); i++) {
			Ouvrage ouvrage = ouvrages.get(i);
			if(ouvrage.getISBN().equals(id)) {
				return i;
			}
		}
		return -1;
	}

}
