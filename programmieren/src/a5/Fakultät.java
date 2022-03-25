package a5;
import static prog.ConsoleReader.*;
public class Fakultät {

	  public static void main(String[] args) {
	        System.out.println (" Bitte gib eine Zahl ein: ");
	        int n  = readInt(" n ");
	        System.out.println (" Ergebnis: " + fakultät(n)  );
	    }
	    
	    public static int fakultät (int n) {
	        int a= 1;
	        for (int x = 1; x <= n; x++) {
	            a= a* x;                        // a wird nach jedem Durchlauf um 1 erhöht
	        }
	        return a;
	    }
}
