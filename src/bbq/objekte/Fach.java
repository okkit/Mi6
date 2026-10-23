package bbq.objekte;

public class Fach extends BBQObjekt{
	
	public String fachName;
	
// Egal wo
//	Fach f = new Fach();
//	f.name = "IT";
	
//	Wenn ohne public:
//	String fachName;
//	dann:
//	die Wertzuweisung dem Feld fachName so: f.name = "IT"; geht NICHT von überall.
//	Was geht, ist, den Wert als Parameter im Konstruktor der Klasse
//	zu übergeben:
	
	public Fach(int id, String fachName) {
		super(id);
		this.fachName = fachName;
	}
	
//	Dann ist die Verwendung:
//	Fach f = new Fach("IT");

}
