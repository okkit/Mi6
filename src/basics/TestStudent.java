package basics;

import tagebuch.TagebuchWriter;

public class TestStudent {

	public static void main(String[] args) {

//		Thomas Müller, geboren am 18.10.2000
		
		Student student = new Student();
		student.name = "Müller";
		student.vorname = "Thomas";
		student.geschlecht = Student.MANNLICH;
		
		Datum datum = new Datum(); //
		
		datum.jahr = 2000;
		datum.tag = 18;
		datum.monat = 10;
		student.gebdat = datum;
		
		TagebuchWriter.addZuTagebuch(student.name);
		
		InstanzPrinter.printStudent(student);
		
//		Sahra Rosenberg, geboren am 7.7.2003.

		student = new Student("Sahra", "Rosenberg", 0, new Datum(2003, 7, 7));
		InstanzPrinter.printStudent(student);
		
		student = new Student("Lena", "Fuchs");
		student = new Student("Mischa", "Wolf");
		
		TagebuchWriter.addZuTagebuch(student.name);
	}

}
