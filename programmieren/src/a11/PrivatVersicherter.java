package a11;

public class PrivatVersicherter extends Kunde {

	public String iban;
	public String bic;
	public PrivatVersicherter( String v, String n, Geschlecht g, Anrede a, Arzt bha, String ib, String bid) {
		super(v,n,g,a,bha);
		bic = bid;
	}
}
