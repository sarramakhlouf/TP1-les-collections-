package TP1;

import java.util.Comparator;

class CompareMoyenne implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return Float.compare(e2.getValue(), e1.getValue());
    }
}
