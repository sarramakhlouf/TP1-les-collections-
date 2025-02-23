package TP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("E123", "Alice Dupont");
        Etudiant etudiant2 = new Etudiant("E456", "Bob Martin");
        Etudiant etudiant3 = new Etudiant("E789", "Charlie Durand");

        etudiant1.addNote(new Note("Mathématiques", 15.5f));
        etudiant1.addNote(new Note("Informatique", 18.0f));

        etudiant2.addNote(new Note("Mathématiques", 12.0f));
        etudiant2.addNote(new Note("Informatique", 14.5f));

        etudiant3.addNote(new Note("Mathématiques", 9.5f));
        etudiant3.addNote(new Note("Informatique", 11.0f));

        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        etudiants.add(etudiant3);

        System.out.println("Étudiant : " + etudiant1.getNom());
        System.out.println("Moyenne : " + etudiant1.getValue());

        System.out.println("\nListe des étudiants triés par matricule :");
        Collections.sort(etudiants);
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        System.out.println("\nListe des étudiants triés par moyenne :");
        etudiants.sort(new CompareMoyenne());
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }
}

