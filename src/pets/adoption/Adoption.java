package pets.adoption;

import pets.Art;
import pets.Geschlecht;
import pets.adoption.objekte.Pet;

public class Adoption {
	
	public static void main(String[] args) {
		
		Pet ilu = new Pet(Art.HUND, Geschlecht.MÄNNCHEN, "Ilu", "Rumänien");
		System.out.println("Ilu ist fertig gebacken " + ilu.toString());
	}

}
