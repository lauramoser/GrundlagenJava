package a11;

public class Krankenpfleger extends Mitarbeiter {
	
	public Krankenpfleger( String v, String n, Geschlecht g, Anrede a, int id, int gh) {
		super(v,n,g,a,id,gh);
	}
	
	public String ansprache() {
		if(anrede == Anrede.FRAU)
			return "Krankenpflägerin" + vorname + nachname;
			return "Krankenpfleger" + vorname + nachname;
	}

	public String formloseAnsprache() {
			if (anrede == Anrede.FRAU) {
				return "Frau" + vorname + nachname;
			} else {
				return "Herr" + vorname + nachname;
			}	
	}

}
