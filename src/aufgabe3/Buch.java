package aufgabe3;

//Es geht um Bücher. 
//Z.B. Stanislaw Lem, Solaris, ISBN 978370997171, Ersterscheinungsdatum, Verlag. 
//Schreibe die Klasse Buch, die ein Buch beschreibt.
public class Buch {

	Autor autor;
	String titel;
	int isbn;

	public Buch(int isbn) {
		this.isbn = isbn;
	}

	public Buch(String titel) {
		this.titel = titel;
	}
	
	public Buch(Autor autor) {
		this.autor = autor;
	}
	
	public Buch(char etwas) {
	}
	
	public Buch(boolean neu) {
	}

}
