package TP1;

import java.util.Collections;
import java.util.List;

public class Stats {

    public static double calculerMoyenne(List<Etudiant> etudiants) {
        if (etudiants.isEmpty()) {
            return 0;
        }
        double somme = 0;
        for (Etudiant etudiant : etudiants) {
            somme += etudiant.getValue();
        }
        return somme / etudiants.size();
    }

    public static Etudiant trouverMax(List<Etudiant> etudiants) {
        if (etudiants.isEmpty()) return null; // Évite l'exception si la liste est vide
        return Collections.max(etudiants, new CompareMoyenne()); // Utilise CompareMoyenne
    }

    public static Etudiant trouverMin(List<Etudiant> etudiants) {
        if (etudiants.isEmpty()) return null;
        return Collections.min(etudiants, new CompareMoyenne()); 
    }

    public static Note getMeilleureNote(Etudiant etudiant) {
        if (etudiant.getNotes().isEmpty()) return null; 
        return Collections.max(etudiant.getNotes(), new NoteComparator());
    }

    public static Note getMoinsBonneNote(Etudiant etudiant) {
        if (etudiant.getNotes().isEmpty()) return null; 
        return Collections.min(etudiant.getNotes(), new NoteComparator());
    }
}

