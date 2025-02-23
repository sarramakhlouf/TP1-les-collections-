package TP1;

import java.util.Comparator;

class EtudiantComparator implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return Float.compare(e1.getValue(), e2.getValue());
    }
}
