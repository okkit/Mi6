package basics;

public class GästeListe {

	public static void main(String[] args) {
		
		String eingabe = IO.readln("Dein Name: ");
		Gast gast = new Gast();
		gast.name = eingabe;
		
		eingabe = IO.readln("Was bringst du? ");
		gast.mitbringsel = eingabe;
		gast.save();

	}

}
