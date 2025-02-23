package TP1;

import java.util.Comparator;

class NoteComparator implements Comparator<Note> {
    @Override
    public int compare(Note n1, Note n2) {
        return Float.compare(n1.getValeur(), n2.getValeur());
    }
}

