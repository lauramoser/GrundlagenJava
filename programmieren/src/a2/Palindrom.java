package a2;
import static prog.ConsoleReader.*;
public class Palindrom {

	public static void main(String[] args) {
        System.out.println ("Gib ein Wort ein");
        String Wort = readString();                 //Wort wurde abgespeichert
        int Wortlaenge = Wort.length();                //Wie viel Buchstaben hat das Wort
        boolean Palindrom = false;
        int a = 0; 
        
        for (a = 0; a < Wortlaenge / 2; a++) {         //for Seite 89
            
            
            if ( Wort.charAt(a) == Wort.charAt(Wortlaenge -1 -a)) {
                    Palindrom = true;
            }
            if ( Wort.charAt(a) != Wort.charAt(Wortlaenge -1 -a)) {
                    Palindrom = false;    
                    break;
            }
        }
        if (Palindrom == true) {
            System.out.println(" Das Wort ist ein Palindrom ");
        }
        if ( Palindrom == false){
            System.out.println(" Das Wort ist kein Palindrom ");
        }
    }
}

