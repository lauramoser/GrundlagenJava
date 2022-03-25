package a6;
import static prog.Picture.*;
public class Rechteck {

	 public static void main(String[] args) {
	        int p[] [] = loadResource ("a6/MyPicture.jpg");
	        for ( int x = 30; x<250; x++) {
	            for (int y = 70; y<160; y++) {
	                p[x][y] = 0;
	            }
	        }
	        
	        show(p);
	   }
	
}
