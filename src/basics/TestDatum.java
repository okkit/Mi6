package basics;

public class TestDatum {

	public static void main(String[] args) {
		
		Datum heute;
		
		// Eine Instanz der Klasse Datum
		heute = new Datum(); 
		heute.jahr = 2026;
		heute.monat = 10;
		heute.tag = 19;
		heute.printeDich();
		
		// Eine zweite Instanz (Exemplar) der Klasse Datum
		Datum silvester = new Datum();
		silvester.jahr = 2026;
		silvester.monat = 12;
		silvester.tag = 31;
		silvester.printeDich();
	}

}
