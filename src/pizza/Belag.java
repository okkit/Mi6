package pizza;

import java.util.HashMap;

public class Belag extends Object{
	
	HashMap<String, Integer> zutaten;
	
	// Standartkonstruktor
	public Belag() {
		zutaten = new HashMap<String, Integer>();
		zutaten.put("Fungi", null);
		zutaten.put("Spinat", null);
		zutaten.put("Salami", null);
		zutaten.put("Käse", null);
		zutaten.put("Paprika", null);
		zutaten.put("Mais", null);
		zutaten.put("Gurke", null);
		zutaten.put("Zwiebeln", null);
	}
	
}
