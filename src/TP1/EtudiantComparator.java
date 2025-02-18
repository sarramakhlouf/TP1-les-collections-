package TP1;

import java.util.Comparator;

public class EtudiantComparator implements Comparator<Etudiant> {
	@Override
	public int compare(Etudiant e1, Etudiant e2) {
	     return Double.compare(e1.getValue(), e2.getValue());
	}
}
