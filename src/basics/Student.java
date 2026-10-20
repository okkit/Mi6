package basics;

/// Die Klasse repräsentiert das Objekt "Student". D.h. sie beschreibt einen
/// Studenten anhand seiner Eigenschaften/Attribute. Eigenschaften/Attribute
/// eines Objektes sind Felder (Fields) der Klasse
public class Student extends Object {

	public static final int WEIBLICH = 0;
	public static final int MANNLICH = 1;

	// Felder der Klasse:
	String vorname;
	String name;
	int geschlecht;
	Datum gebdat;

	/**
	 * Konstruiert eine Instanz der Klasse und initialisiert 
	 * alle Felder anhand der Parameter.
	 * @param vorname
	 * @param name
	 * @param geschlecht
	 * @param gebdat
	 */
	public Student(String vorname, String name, int geschlecht, Datum gebdat) {
		this(vorname, name); // Wir verwenden den bereits vorhandenen Konstruktor (hier unten)
		this.geschlecht = geschlecht;
		this.gebdat = gebdat;
	}

	/**
	 * Konstruiert eine Instanz der Klasse und initialisiert die Felder vorname und
	 * name anhand der Parameter.
	 * 
	 * @param firstname
	 * @param name
	 */
	public Student(String firstname, String name) {
		super();
		vorname = firstname; // Feld und Parameter heißen verschieden
		this.name = name; // Feld und Parameter heißen gleich
	}

	/**
	 * Standartkonstruktor Standartkonstruktor = Konstruktor ohne Parameter
	 */
	public Student() {
		super();
		System.out.println("Hallo aus dem Standartkonstruktor");
	}

}
