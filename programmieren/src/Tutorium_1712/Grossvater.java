package Tutorium_1712;

public class Grossvater {

	public int age;
	public String nachname;
	public String vorname;
	
	public Grossvater(int a, String n, String v) {
		age = a % 100;
		nachname = n;
		vorname = v;
	}
	
}

//Polimofie:
//das was die Mutterklasse hat übernommen und umändern.