package a2;
import static prog.ConsoleReader.*;
public class MiniMaxDrei {

	public static void main(String[] args) {
        int a = readInt("a");
        int b = readInt("b");
        int c = readInt("c");
        
        if(a>b && a>c) {
            System.out.println ("max: " + a);    
        } 
        if (b>a && b>c) {
            System.out.println ("max: " + b);
        }
        if (c>a && c>b) {
            System.out.println ("max: " + c);
        }
        
        if (a<b && a<c) {
            System.out.println ("min: " + a);
        }

        if (b<a && b<c) {
            System.out.println ("min: " + b);
        }
        
        if (c<a && c<b) {
            System.out.println ("min: " + c);
        }
    }
}

