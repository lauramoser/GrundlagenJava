package a2;
import static prog.ConsoleReader.*;
public class MinMax {

	 public static void main(String[] args) {
	        System.out.println ("Gib eine Zahl ein");
	        int x[] = readIntArray();
	        int Min = 2147483647;
	        int Max = -2147483647;
	        for (int i = 0; i<x.length; i++) {
	            if(x[i] < Min) {
	                Min = x[i];
	            }
	            
	            if(x[i] > Max) {
	                Max = x[i];
	            }
	        }
	                
	        System.out.println ("min: " + Min);
	        System.out.println ("max: " + Max);
	  }
	
}
