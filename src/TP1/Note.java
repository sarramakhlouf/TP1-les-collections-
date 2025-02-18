package TP1;

import java.util.Comparator;

public class Note implements Statisticable, Comparator<Note>{
	public Note(String intitule, double valeur) {
		super();
		this.intitule = intitule;
		this.valeur = valeur;
	}
	private String intitule;
	private double valeur;
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	@Override
	public double getValue() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	@Override
	public String toString() {
		return "Note [intitule=" + intitule + ", valeur=" + valeur + "]";
	}
	
	@Override
	public int compare(Note no1, Note no2) {
	     return Double.compare(no1.getValue(), no2.getValue());
	}
	
	
	
	

}
