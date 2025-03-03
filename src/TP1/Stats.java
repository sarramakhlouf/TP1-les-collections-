package TP1;

import java.util.Collections;
import java.util.List;

public class Stats {

    public static double calculerMoyenne(List<Etudiant> etudiants) {
        double somme = 0;
        for (Etudiant etudiant : etudiants) {
            somme += etudiant.getValue();
        }
        return somme / etudiants.size();
    }

    public static Etudiant trouverMax(List<Etudiant> etudiants) {
    	return Collections.max(etudiants, new EtudiantComparator());
    }

    public static Etudiant trouverMin(List<Etudiant> etudiants) {
        return Collections.min(etudiants, new EtudiantComparator()); 
    }

    public static Note getMeilleureNote(Etudiant etudiant) { 
        return Collections.max(etudiant.getNotes(), new NoteComparator());
    }

    public static Note getMoinsBonneNote(Etudiant etudiant) {
        return Collections.min(etudiant.getNotes(), new NoteComparator());
    }
}

