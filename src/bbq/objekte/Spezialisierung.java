/**
 * @author ValentinaTikko
 */
package bbq.objekte;

/**
 * Die Klasse repräsentiert das Objekt Spezialisierung und <br>
 * entspricht der DB-Entität SPEZIALISIERUNG.
 */
public class Spezialisierung extends BBQObjekt {
	
	public int fach_id; // FK = PK aus Fach

	/**
	 * Bezeichnung der Spezialisierung
	 */
	public String bezeichnung;

	public Spezialisierung(int id, String bezeichnung, int fach_id) {
		super(id);
		this.bezeichnung = bezeichnung;
		this.fach_id = fach_id;
	}

//	@Override
//	public String toString() {
//		return "Instanz von Spezialisierung\n" + bezeichnung + " mit id " + id;
//	}

}
