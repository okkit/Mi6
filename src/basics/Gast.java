package basics;

import utils.MyFileWriter;

public class Gast {
	
	String name;
	String mitbringsel;
	
	public void save() {
		
		MyFileWriter.write2File("./protokolle/Gästeliste.txt", name + "| " + mitbringsel);
	}

}
