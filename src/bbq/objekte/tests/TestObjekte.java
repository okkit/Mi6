package bbq.objekte.tests;

import bbq.objekte.Azubi;
import bbq.objekte.Gruppe;
import bbq.objekte.Spezialisierung;

public class TestObjekte {

	public static void main(String[] args) {

		// Aus der DB geladen und als Objekte instanziiert
		Spezialisierung si = new Spezialisierung(1, "SI");
		Spezialisierung ae = new Spezialisierung(2, "AE");
		Spezialisierung da = new Spezialisierung(3, "DA");

		Gruppe u30 = new Gruppe(1, "U30");
		Gruppe u31 = new Gruppe(2, "U31");

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

			Azubi azubi = new Azubi(++id, name, wahl);

			u30.aufnehmeInDieGruppe(azubi);

			azubi = new Azubi(++id, "Mischa", ae);
			u30.aufnehmeInDieGruppe(azubi);

		}

		IO.print("Ende");
	}

}
