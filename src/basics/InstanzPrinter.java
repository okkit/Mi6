package basics;

public class InstanzPrinter {

	public static void printDatum(Datum d) {
		IO.println("Jahr " + d.jahr);
		IO.println("Monat " + d.monat);
		IO.println("Tag " + d.tag);

	}

	public static void printStudent(Student s) {
		
		IO.println("Student");
		IO.println(s.name);
		IO.println(s.vorname);
		IO.println(s.geschlecht);
		
		IO.println(s.gebdat.tag + "-" + s.gebdat.monat + "-" + s.gebdat.jahr);
	}

}
