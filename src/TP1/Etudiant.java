package TP1;

import java.util.ArrayList;
import java.util.List;

class Etudiant implements Statisticable, Comparable<Etudiant> {
    private String matricule;
    private String nom;
    private List<Note> notes;

    public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public Etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public float getValue() {
        if (notes.isEmpty()) return 0;
        float somme = 0;
        for (Note note : notes) {
            somme += note.getValeur();
        }
        return somme / notes.size();
    }

    @Override
    public int compareTo(Etudiant autre) {
        return this.matricule.compareTo(autre.matricule);
    }

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", notes=" + notes + "]";
	}

    
}
