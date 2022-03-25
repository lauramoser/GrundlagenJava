package bootcamp;
import static prog.ConsoleReader.*;
public class Baumkonfigurator {

	public static void main (String[] args) {
		System.out.println("Gib die Höhe und Breite an");
		int Breite = readInt();
		int Höhe = readInt();
		
		for(int i= 0; i<Breite/2; i++) {
			for(int j=0; j<Breite/2 -i; j++) {
				System.out.print(" ");
			}
			for(int x=0; x<i*2+1; x++) {
				System.out.print("x");
			}
			System.out.print("\n");
		}
		
	
			
		
	}
}
