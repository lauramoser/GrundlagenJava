package a11;

public class Kunde extends Person {

	public Arzt behandelnderArzt;
	public Kunde( String v, String n, Geschlecht g, Anrede a, Arzt bha) {
		super(v,n,g,a);
		behandelnderArzt = bha;
	}
	
	public boolean arztRangHoeherAlsBei(Kunde x) {
		return behandelnderArzt.rangHoeherAls(x.behandelnderArzt);
		
	}
}
