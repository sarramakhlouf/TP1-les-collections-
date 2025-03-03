package TP1;

public class Fiche {
	private String nom;
	private String numero;
	private String addresse;
	
	public Fiche(String nom, String numero, String addresse) {
		this.nom = nom;
		this.numero = numero;
		this.addresse = addresse;
	}
	
	public String getNom() {
		return this.nom;	
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Fiche [nom=" + nom + ", numero=" + numero + ", addresse=" + addresse + "]";
	}
	

}
