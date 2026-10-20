/**
 * @author ValentinaTikko
 */
package basics;

/// Diese Klasse beschreibt ein Datum. 
/// Sie - wie auch alle anderen Klassen -
/// erweitert die Klasse Object. 
/// Diese Klasse ist die Tochterklasse der Klasse
/// Object. 
public class Datum extends Object {

	// Felder der Klasse
	int jahr;
	int monat;
	int tag;
	
	

	public Datum() {
		super();
	}


	public Datum(int jahr, int monat, int tag) {
		super();
		this.jahr = jahr;
		this.monat = monat;
		this.tag = tag;
	}



	public void printeDich() {
		IO.println("Jahr " + jahr);
		IO.println("Monat " + monat);
		IO.println("Tag " + tag);
	}

}
