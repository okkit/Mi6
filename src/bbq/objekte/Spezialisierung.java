/**
 * @author ValentinaTikko
 */
package bbq.objekte;

/**
 * Die Klasse repräsentiert das Objekt Spezialisierung und <br>
 * entspricht der DB-Entität SPEZIALISIERUNG.
 */
public class Spezialisierung extends BBQObjekt {
	
	public Fach fach;

	/**
	 * Bezeichnung der Spezialisierung
	 */
	public String bezeichnung;

	public Spezialisierung(int id, String bezeichnung) {
		super(id);
		this.bezeichnung = bezeichnung;
	}

//	@Override
//	public String toString() {
//		return "Instanz von Spezialisierung\n" + bezeichnung + " mit id " + id;
//	}

}
