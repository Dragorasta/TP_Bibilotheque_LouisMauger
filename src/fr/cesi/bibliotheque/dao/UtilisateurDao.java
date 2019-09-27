package fr.cesi.bibliotheque.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.cesi.bibliotheque.model.Utilisateur;
import fr.cesi.bibliotheque.model.UnknownUtilisateurException;


public class UtilisateurDao {
	
	private static List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	private static Long idSequence = 1L;
	
	public UtilisateurDao() { }
	
	
	public static void addUtilisateur(Utilisateur utilisateur) {
		utilisateur.setId(idSequence++);
		utilisateurs.add(utilisateur);
	}
	
	
	public static void updateUtilisateur(Utilisateur utilisateur) throws UnknownUtilisateurException {
		int index = getUtilisateurIndexById(utilisateur.getId());
		if(index > -1) {
			utilisateurs.set(index, utilisateur);
		} else {
			throw new UnknownUtilisateurException(utilisateur.getId());
		}
	}
	
	
	public static Utilisateur findUtilisateurById(Long id) throws UnknownUtilisateurException {
		int index = getUtilisateurIndexById(id);
		if(index > -1) {
			Utilisateur utilisateur = utilisateurs.get(index);
			return utilisateur;
		}
		throw new UnknownUtilisateurException(id);
	}
	
	
	public static List<Utilisateur> getAllUtilisateurs() {
		return Collections.unmodifiableList(utilisateurs);
	}
	
	
	public static void removeUtilisateur(Utilisateur utilisateur) throws UnknownUtilisateurException {
		removeUtilisateur(utilisateur.getId());
	}
	
	
	public static void removeProduct(Long id) throws UnknownUtilisateurException {
		int index = getUtilisateurIndexById(id);
		if(index > -1) {
			utilisateurs.remove(index);
		} else {
			throw new UnknownUtilisateurException(id);
		}
	}
	
	private static int getUtilisateurIndexById(Long id) {
		for (int i = 0; i < utilisateurs.size(); i++) {
			Utilisateur utilisateur = utilisateurs.get(i);
			if(utilisateur.getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

}
