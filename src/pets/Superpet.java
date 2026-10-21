package pets;

/// Die Mutterklasse aller Pets
public class Superpet {
	public Art art;
	public Geschlecht geschlecht;
	
	public Superpet(Art art, Geschlecht geschlecht) {
		super();
		this.art = art;
		this.geschlecht = geschlecht;
	}

	/// Standartkonstruktor
	public Superpet() {
		// Kann auch leer bleiben
	}
	
}
