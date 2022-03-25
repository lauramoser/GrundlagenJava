package a5;
import static prog.ConsoleReader.*;
public class Fibonacci {

	public static void main(String[] args) {
        System.out.println (" Bitte gib eine Zahl ein: ");
        int n  = readInt("n");
        System.out.println ("Ergebnis:" + fibonacci(n) );
    }
    public static int fibonacci (int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        
         if(n<0) {
            return 0; 
        }
        
        for (int i = 0; i< n -1; i++) {
            c= a +b;
            b= a;
            a= c;
            
        }
        return a;
    }
}

