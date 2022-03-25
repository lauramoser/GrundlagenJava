package a3;
import static prog.ConsoleReader.*;
public class Durchschnitt {

	 public static void main(String[] args) {
	        System.out.println (" Bitte Zahlen eingeben: ");
	        int zahlen[]= readIntArray();            //alle Zahlen werden gelesen und in "Zahlen" gespeichert
	        
	        System.out.println (" Die Summe ist: " + summe(zahlen) );
	        System.out.println (" Das arithmatische Mittel ist: " + arithMittel(zahlen) );
	    }
	    
	     
	    public static int summe(int zahlen[]) {
	        int summe = 0;    
	        for (int a = 0; a< zahlen.length; a++ ) {
	            summe = summe + zahlen[a];
	        }

	        return summe;
	    }

	    
	    
	    public static int arithMittel(int zahlen[]) {
	        int arithMittel = summe(zahlen) / zahlen.length;
	        return arithMittel;
	    }
}
