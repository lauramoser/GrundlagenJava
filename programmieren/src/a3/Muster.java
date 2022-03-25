package a3;
import static prog.ConsoleReader.*;
public class Muster {

	 public static void main(String[] args) {
         System.out.println ("Gib ein Wort ein");
         String Wort = readString();                 
         muster(Wort);        
     }
     
     
     public static void muster(String Wort) {
         int Wortlaenge = Wort.length();    
         int a = 0;
         for (int i = 0; i<Wortlaenge; i++) {
             
             for (int y = 0; y< a; y++) {
                 System.out.print(Wort.charAt(y));
         }
             
             for(int x = i; x<Wortlaenge; x++) {
                 System.out.print(Wort.charAt(a));
             }
             
             
             a++;
             System.out.println("");
         }        
     }        
}

