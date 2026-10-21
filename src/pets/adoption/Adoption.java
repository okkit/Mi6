package pets.adoption;

import pets.Art;
import pets.Geschlecht;
import pets.adoption.objekte.Pet;

public class Adoption {
	
	public static void main(String[] args) {
		
		// Wir erzeugen eine Instanz der Klasse Pet
		// Dafür verwenden wir den Konstruktor
		// der Klasse Pet
		Pet ilu = 
				new Pet(Art.HUND, Geschlecht.MÄNNCHEN, "Ilu", "Rumänien");
		System.out.println("Ilu ist fertig gebacken " + ilu.toString());
		
		Pet rex = new Pet();
		rex.art = Art.HUND;
		
		}

}
