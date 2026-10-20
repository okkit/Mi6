package basics;

import java.util.ArrayList;

/// Die Klasse repräsentiert eine BBQ-Gruppe. Zum Beispiel U30-06b
public class Lerngruppe extends Object {

	// Felder der Klasse:
	String bezeichnung;
//	Student[] mitglieder = new Student[10];

	ArrayList<Student> mitglieder = new ArrayList<Student>();

	public void aufnehmen(Student studi) {
		mitglieder.add(studi);

	}

	public void rausschmeissen(Student studi) {
		if (mitglieder.contains(studi))
			mitglieder.remove(studi);
	}

}
