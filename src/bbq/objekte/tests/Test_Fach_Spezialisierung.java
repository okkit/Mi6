package bbq.objekte.tests;

import bbq.objekte.Fach;
import bbq.objekte.Spezialisierung;

public class Test_Fach_Spezialisierung {

	public static void main(String[] args) {
		
//		Aufgabe 2.1
//		Eine Instanz der Klasse Fach
//		Entspricht einem Datensatz in der Tabelle Fach
//		Beispiel: Fach f = new Fach();
//		f ist eine Instanz der Klasse Fach
		
		// Als währe dieser Wert aus der DB
		Fach f = new Fach(12, "IT");
		IO.println(f.fachName);
				
//		Aufgabe 2.b
//		Mehrere Instanzen der Klasse Spezialisierung
//		Die Instanzen entspechen Datensätzen der Tabelle 
//		Spezialisierung
//		ACHTUNG! Die 1:m Beziehung beachten
		
		Spezialisierung ae = new Spezialisierung(42, "AE");
		IO.println(ae.id);
		
		ae.fach = f;
		IO.println(ae.fach.fachName);
		
		Spezialisierung si = new Spezialisierung(128, "SI");
		IO.print(si.bezeichnung );
		
//		Aufgabe 2.c
//		Wir haben jetzt NUR das Obkekt si.
//		Das Objekt f (s. oben) vergessen wir jetzt, als wäre es nicht da.
//		Wir wollen erfahren, wie das Fach heißt, zu dem die
//		Spezialisierung ae gehört. 
//		Wie können wir es verwirklichen? Geht das überhaupt?
		
//		Aufgabe 2.d
//		Wir wollen erfahren, welche Spezielisierungen hat
//		das Fach IT.
//		Wie können wir es machen?
	}

}
