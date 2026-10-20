package pizza;

public class Koch {

	public void machPizza(Pizzazutaten zutaten) {
		IO.print("Ich rühre ");
	}

	public void besouse(Pizzasouse sousse) {
		IO.print("Ich schmiere die Souse auf den Teig ");
	}

	public void belege(Belag belag) {
		IO.print("Ich belege ");
	}

	public Pizza backe() {
		IO.print("Ich backe im Steinofen ");
		return new Pizza();
	}

	public static void main(String[] args) {
		Koch pizzabäcker = new Koch();
		
		Pizzazutaten zutaten = new Pizzazutaten();
		zutaten.eier = 1;
		zutaten.hefe = 20;
		zutaten.wasser = 100;
		zutaten.mehl = 322;
		zutaten.salz = 50;
		zutaten.zucker = 10;
				
		pizzabäcker.machPizza(zutaten);
		
		Tomatensouse souse = new Tomatensouse();
		souse.olivenöl = 20;
		souse.oregano = 5;
		souse.tomatenpasta = 100;
		
		pizzabäcker.besouse(souse);
	
		pizzabäcker.belege(null);
		
		Belag belag = new Belag();
		belag.zutaten.put("Fungi", 200);
		
		pizzabäcker.belege(belag);
		
		Pizza pizza = pizzabäcker.backe();
	}

}










