package bbq.objekte;

/**
 * Die Klasse repräsentiert ein beliebiges Objekt und<br>
 * entspricht einer DB-Entität (Tabelle in einer relationalen Datenbank).
 */
public class BBQObjekt extends Object{
	/**
	 * Entspricht dem PK
	 */
	public int id;

	public BBQObjekt(int id) {
		this.id = id;
	} 	
	
	// Wir überschreiben die Methode toString() der Klasse Object
	
//	@Override
//	public String toString() {
//
//		String info = super.toString() + " \n";
//		info = info + "Eine Instanz der Klasse BBQObject\n";
//		info = info + " id: " + id;
//		return info;
//	}
	
}
