package pets.adoption.objekte;

import pets.Art;
import pets.Geschlecht;
import pets.Superpet;

//In einer Software für Online-Portal "Hundehilfe Russland"
//Variante 2 Pet adoptieren
//name
//art
//geschlecht
//herkuntsland

/// Pet ist die Tochterklasse der Klasse Superpet
public class Pet extends Superpet {

	public String name;
	public String land;
	
	/// Wenn eine Tochterklasse einen Standartkonstruktor
	/// hat, MUSS auch die Mutterklasse einen haben.
	public Pet() {
		super();
	}

	/// In diesem Konstruktor werden ALLE Felder, d.h. 
	/// auch die, die in der Mutterklasse deklariert sind,
	/// anhand der Parameter initialisiert
	public Pet(Art art, Geschlecht geschlecht, String name, String land) {
		// Aufruf des Konstruktors der Mutterklasse
		super(art, geschlecht); 
		this.name = name;
		this.land = land;
	}
	
	
}
