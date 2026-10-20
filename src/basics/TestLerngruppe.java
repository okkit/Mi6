package basics;

public class TestLerngruppe {

	public static void main(String[] args) {
		
		Lerngruppe gruppe = new Lerngruppe();
		gruppe.bezeichnung = "U30-AE";
		
		Student studi = new Student();
		studi.name = "Curie";
		gruppe.aufnehmen(studi);
		
		studi = new Student();
		studi.name = "Scharapov";
		gruppe.aufnehmen(studi);
		
		
		gruppe = new Lerngruppe();
		gruppe.bezeichnung = "U30-SI";
		
		studi = new Student();
		studi.name = "Frey";
		gruppe.aufnehmen(studi);
		
		studi = new Student();
		studi.name = "Carli";
		gruppe.aufnehmen(studi);
		
		studi = new Student();
		studi.name = "Das";
		gruppe.aufnehmen(studi);

	}

}
