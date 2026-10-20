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

public class Pet extends Superpet {

	String name;
	String land;
	
	public Pet() {
		super();
	}

	public Pet(Art art, Geschlecht geschlecht, String name, String land) {
		super(art, geschlecht);
		this.name = name;
		this.land = land;
	}
	
	
}
