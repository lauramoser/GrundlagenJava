package a4;
import static prog.ConsoleReader.*;
public class Vorkommen {

	 public static void main(String[] args) {
	        System.out.println ("Bitte gib ein Wort ein");
	        String word = readString(); 
	        vorkommen(word);
	        
	    }
	    
	    
	    public static void vorkommen(String Wort) {
	        int Wortlaenge  = Wort.length();
	        int a = 0;
	        int zaehler = 0;
	        
	        for (a=0; a<Wortlaenge; a++) {                     
	            
	            for (int i = 0; i<Wortlaenge; i++) {
	                if( Wort.charAt(a) == Wort.charAt (i)) {
	                    zaehler++;
	                }
	                    
	            }

	            System.out.println(Wort.charAt(a) + " " + zaehler);
	            zaehler = 0;
	        }
	    }
}
