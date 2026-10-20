package pets.tierpraxix.objekte;

import pets.Art;
import pets.Geschlecht;
import pets.Superpet;

// In einer Software einer Tierpraxis
//Variante 3 Pet beim Tierarzt
//Name
//Nachname 
//art
//Impfstatus
//Gewicht
//Versicherung?
public class Pet extends Superpet{
	String name;
//	Art art;
//	Geschlecht geschlecht;
	boolean geimft;
	double gewicht;
	boolean versichert;
	
	public Pet(Art art, Geschlecht geschlecht) {
		super(art, geschlecht);

	}
}
