package inseln;

import java.util.ArrayList;

public class Insel {

	int nummer;
	ArrayList<Zelle> zellen;
	
	// Sobald eine Zelle gefunden wurde, die noch zu
	// keiner Insel gehört, haben wir eine neue Insel gefunden!
	public Insel(int nummer) {
		super();
		this.nummer = nummer;
	}
	
	public void addZelle(Zelle zelle) {
		zellen.add(zelle);
	}
}
