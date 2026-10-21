package bbq.objekte.tests;

import bbq.objekte.Azubi;
import bbq.objekte.Spezialisierung;

public class TestObjekte {

	public static void main(String[] args) {

		// Aus der DB geladen und als Objekte instanziiert
		Spezialisierung si = new Spezialisierung(1, "SI");
		Spezialisierung ae = new Spezialisierung(2, "AE");
		Spezialisierung da = new Spezialisierung(3, "DA");
		
		int id = 0;

		while (IO.readln("Der Nächste? ").equals("ja")) {

			String name = IO.readln("Ihr name? ");
			String spez = IO.readln("Was wollen Sie werden? " + "a = SI, b = AE, c = DA\n");

			Spezialisierung wahl = null;
			if (spez.equals("a"))
				wahl = si;
			else if (spez.equals("b"))
				wahl = ae;
			else if (spez.equals("c"))
				wahl = da;

			// Die Instanz azubi wird letztenendes in die DB gespeichert
			Azubi azubi = new Azubi(++id, name, wahl);
			IO.println("-------------------------------");
			IO.println("Eingetragen.\n " + azubi.toString());
		}
		
		IO.print("Ende");
	}

}
