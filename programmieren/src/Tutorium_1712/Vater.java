package Tutorium_1712;

public class Vater extends Grossvater{		//extends --> erbt von Grossvater	
	
	public Vater(int a, String n, String v) {
		super(a, n, v);
		this.age = a;
		nachname = n;
		vorname = v;
		
	}
	
	@Override
	public String ansprache() {
		return "Prof. " + this.vorname + " " + this.nachname;
	}

}
