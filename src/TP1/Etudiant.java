package TP1;

import java.util.ArrayList;
import java.util.Comparator;

public class Etudiant implements Statisticable, Comparator<Etudiant>{
	private String matricule;
	private String nom;
	private ArrayList<Note> notes;
	
	public Etudiant (String mat, String name) {
		this.matricule = mat;
		this.nom = name;
		this.notes = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", notes=" + notes + "]";
	}

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

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}
	@Override
	public double getValue() {
	    if (notes.isEmpty()) {
	        return 0;
	    }
	    double somme = 0.0;
	    for (int i = 0; i < notes.size(); i++) {
	        somme += notes.get(i).getValue();
	    }
	    return somme / notes.size();
	}

	public void addNote(Note note) {
        this.notes.add(note);
    }
	
	@Override
	public int compare(Etudiant e1, Etudiant e2) {
	     return Double.compare(e1.getValue(), e2.getValue());
	}

}
