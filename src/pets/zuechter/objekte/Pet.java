package pets.zuechter.objekte;

import java.time.LocalDate;

import pets.Art;
import pets.Geschlecht;
import pets.Superpet;

//In einer Software für einen Züchter
//Variante 1 Pet kaufen
//geschlecht
//art
//stammbauch
//pass
//alter

public class Pet extends Superpet{

//	Geschlecht geschlecht;
//	Art art;
	boolean hatStammbaum;
	boolean hatPass;
	LocalDate geburtsdatum;
	
	
	public Pet(Art art, Geschlecht geschlecht) {
		super(art, geschlecht);

	}

}
