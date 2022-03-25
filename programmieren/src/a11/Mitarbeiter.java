package a11;

public class Mitarbeiter extends Person {

	public int personalnummer;
	public int gehalt;
	public Mitarbeiter( String v, String n, Geschlecht g, Anrede a, int id, int gh) {
		super(v,n,g,a);
		personalnummer = id;
		gehalt = gh;
	}
}
