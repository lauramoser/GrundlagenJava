package bootcamp;
import static prog.ConsoleReader.*;
public class Primzahlen {

	public static void main (String[] args) {
		System.out.println("Bitte gib eine Zahl ein");
		int zahl = readInt();
		boolean Zahl = false;
	for(int z= 2; z<zahl; z++) {
		if (zahl%z==0) {
			System.out.println("Es ist keine Primzahl");	
			Zahl= true;
			break;
		}
	}
	 if (Zahl == false) {
		 System.out.println("Es ist eine Primzahl");
	 }
	}
}
