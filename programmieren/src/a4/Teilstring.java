package a4;
import static prog.ConsoleReader.*;
public class Teilstring {

	 public static void main(String[] args) {
	        System.out.println("Bitte gib zwei Wörter ein:");
	        String wort = readString("x");                                                //wort 1 wird gelesen und gespeichert
	        String wort2 = readString("y");                                                //wort 2 wird gelesen und gespeichert

	       System.out.println(" Ergebnis " +teilStringPosition(wort, wort2));        //es wird auf die "teilStringPosition" Methode verwiesen und das Ergebnis ausgegeben

	    }

	    public static int teilStringPosition ( String wort, String wort2) {            
	           int i = 0;                                                                    
	        int zaehler = 0;
	        int zaehler2 = 0;
	        for (zaehler = 0; zaehler < wort.length(); zaehler++) {                                       
	           for ( zaehler2= 0; zaehler2 < wort2.length(); zaehler2++) {
	                if(zaehler2 + zaehler >= wort.length()) {
	                    return -1;
	                }
	                if(wort.charAt(zaehler2 + zaehler)== wort2.charAt(zaehler2)) {
	                    i++; 
	                }
	           }
	           if  (i >= wort2.length()) {
	               return zaehler;
	           }
	           else {
	               i= 0;
	           }
	         }
	        return -1;
	    }
}
