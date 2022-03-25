package a6;
import static prog.Picture.*;
public class Kreis {

	  public static void main(String[] args) {
	        int p[] [] = loadResource ("a6/MyPicture.jpg");
	        int x = 150;
	        int y = 150;
	        int radius = 100;
	        
	        for(int i = 0; i<p.length; i++) {
	            for ( int j = 0; j< p[0].length; j++ ) {
	                int a = Math.abs(i-x);
	                int b = Math.abs(j-y);
	                double c= Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
	                
	                if(c<radius) {
	                    p[i][j]=0;
	                }
	                
	            }
	            
	        }
	        show(p);
	  }
}
