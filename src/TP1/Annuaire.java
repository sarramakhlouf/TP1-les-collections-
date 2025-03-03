package TP1;

import java.util.HashMap;
import java.util.Map;

public class Annuaire {
	private Map<String, Fiche> numerostel;
	
	public Annuaire () {
		this.numerostel= new HashMap<>();
	}
	
	public void ajouterFiche(String nom, String numero, String adresse) {
		numerostel.put(nom, new Fiche(nom, numero, adresse));
    }
	
	public void rechercheFiche(String nom) {
		Fiche fiche = numerostel.get(nom);
	    if (fiche != null) {
	      System.out.println(fiche);
	    } else {
	      System.out.println("Aucune fiche trouvée pour : " + nom);
	    }
	}
	
	public void afficherFiches() {
        for (Fiche fiche : numerostel.values()) {
            System.out.println(fiche);
        }
    }
	
}
	    

