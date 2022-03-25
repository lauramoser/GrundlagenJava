package a6;
import static prog.Picture.*;
public class Scheren {

	public static void main(String[] args) {
        int p[] [] = loadResource ("a6/MyPicture.jpg");
        int x = 0;
        int zaehler= 0;
        
        for(int i= 321; i>=0;i--) {
            zaehler++;
            for(int a=i; a>0; a--) {
                x= p[p.length-1][zaehler];
                for( int v=p.length-1; v>0; v--) {
                    p[v][zaehler]= p[v-1][zaehler];
                }
                p[0][zaehler]=x;
            }
            
        }
        show(p);
    }

}
