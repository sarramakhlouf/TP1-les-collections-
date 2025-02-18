package TP1;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("E123", "Alice Dupont");

        etudiant1.addNote(new Note("Mathématiques", 15.5));
        etudiant1.addNote(new Note("Informatique", 18.0));

        System.out.println("Étudiant : " + etudiant1.getNom());
        System.out.println("Moyenne : " + etudiant1.getValue()); 
    }
}

