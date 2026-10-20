package tagebuch;

import utils.MyFileWriter;

/// Hilfsklasse zum Schreiben eines Tagebuchs, d.h. alle Ausgaben beim Testen
/// von unseren Klassen
public class TagebuchWriter {

	private static final String FILE = "./protokolle/Tagebuch.txt";

	/// Fügt einen Text zum File Tagebuch.txt im Folder protokolle hinzu
	public static void addZuTagebuch(String text) {

		StackTraceElement[] stes = Thread.currentThread().getStackTrace();

		StackTraceElement ste = stes[stes.length - 1];
		String caller = "Aufgeruf aus  " + ste.getClassName() + "." + ste.getMethodName();

		MyFileWriter.write2File(FILE, caller);
		MyFileWriter.write2File(FILE, text);
	}

}
