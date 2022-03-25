package a3;
import static prog.ConsoleReader.*;
public class SummeDurchschnitt {

	public static void main(String[] args) {
        System.out.println (" Bitte Zahlen eingeben: ");
        int zahlen[]= readIntArray();            //alle Zahlen werden gelesen und in "Zahlen" gespeichert
        
        System.out.println (" Bitte eingeben: " + summe(zahlen) );
        
    }
    
     
    public static int summe(int zahlen[]) {
        int summe = 0;    
        for (int a = 0; a< zahlen.length; a++ ) {
            summe = summe + zahlen[a];
        }

        return summe;     
        
    }
    
}
