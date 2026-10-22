/**
 *@author ValentinaTikko
 */
package bbq.objekte;

/**
 * Die Klasse repräsentiert das Objekt Azubi und <br>
 * entspricht der DB-Entität AZUBI.
 */
public class Azubi extends BBQObjekt {

	/**
	 * Name des/der Azubi's
	 */
	protected String name;
	Spezialisierung spezialisierung;

	/**
	 * 
	 * @param id
	 * @param name
	 * @param spezialisierung
	 */
	public Azubi(int id, String name, Spezialisierung spezialisierung) {
		super(id);
		this.name = name;
		this.spezialisierung = spezialisierung;
	}

	@Override
	public String toString() {

		String info = super.toString() + "\n";
		info = info + "Info aus der Klasse Azubi\n";
		info += "name " + name + "\n";
		info += spezialisierung.toString();
		info += "\n-------------------------------\n";

		return info;
	}
}
