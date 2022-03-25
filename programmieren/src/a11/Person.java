package a11;

public class Person {

	String nachname = "";
	String vorname = "";
	public Geschlecht geschlecht;
	public Anrede anrede;

	public Person (String v, String n, Geschlecht g, Anrede a) {
		vorname = v;
		nachname = n;
		geschlecht = g;
		if(geschlecht == Geschlecht.MAENNLICH && a == null)
			anrede = Anrede.HERR;
		if(geschlecht == Geschlecht.WEIBLICH && a == null)
			anrede = Anrede.FRAU;
		if(a!= null)
			anrede = a;
	}
			
	public String ansprache() {
		if (anrede == Anrede.FRAU) {
			return "Frau" + vorname + nachname;
		} else {
			return "Herr" + vorname + nachname;
		}

	}
}
