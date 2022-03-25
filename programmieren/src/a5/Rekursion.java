package a5;
import static prog.ConsoleReader.*;
public class Rekursion {

	 public static void main(String[] args) {
	        System.out.println (" Bitte gib eine Zahl ein: ");
	        int n  = readInt(" n ");
	        System.out.println (" Ergebnis: " + rekursion(n)  );
	    }
	    
	    public static int rekursion (int n) {
	        
	        if ( n == 1) {
	            return 1;
	        }
	        
	        return rekursion (n-1) * n;
	    }
}
