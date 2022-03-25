package a6;
import static prog.Picture.*;
public class Verschieben {

	public static void main(String[] args) {
        int p[] [] = loadResource ("a6/MyPicture.jpg");
        int x[] = new int [p[0].length-1];
        
        for(int i = 0; i<180; i++) {
            
            for(int j=0; j<p[0].length-1; j++) {
                x[j] = p [p.length-1][j];
            }
            for(int v = p.length-1; v>0; v--) {
                for ( int zaehler = 0; zaehler<p[0].length-1; zaehler++) {
                    p[v][zaehler] = p[v-1][zaehler];
                }
            }
            for( int zaehler = 0; zaehler<p[0].length-1; zaehler++) {
                p[0][zaehler] = x[zaehler];
            }
        }
        show(p);
    }
}
