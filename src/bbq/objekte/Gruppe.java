package bbq.objekte;

import java.util.ArrayList;

public class Gruppe extends BBQObjekt {

	private String bezeichnung;
	private ArrayList<Azubi> teilnehmer;

	public Gruppe(int id, String bezeichnung) {
		super(id);
		this.bezeichnung = bezeichnung;
	}
	
	public void aufnehmeInDieGruppe(Azubi jemand) {
		
		if (teilnehmer == null) {
			teilnehmer = new ArrayList<Azubi>();
		}
		teilnehmer.add(jemand);
	}

}
