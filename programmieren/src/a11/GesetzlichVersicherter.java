package a11;

public class GesetzlichVersicherter extends Kunde {

	public String krankenkasse;
	public GesetzlichVersicherter( String v, String n, Geschlecht g, Anrede a, Arzt bha, String kk) {
		super(v,n,g,a,bha);
		krankenkasse = kk;
	}
}
