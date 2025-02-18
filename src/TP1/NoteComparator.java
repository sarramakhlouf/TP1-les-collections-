package TP1;

import java.util.Comparator;

public class NoteComparator implements Comparator<Note>{
	@Override
	public int compare(Note no1, Note no2) {
	     return Double.compare(no1.getValue(), no2.getValue());
	}

}
