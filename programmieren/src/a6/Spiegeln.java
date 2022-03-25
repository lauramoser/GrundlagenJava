package a6;
import static prog.Picture.*;
public class Spiegeln {

    public static void main(String[] args) {
        int p[] [] = loadResource ("a6/MyPicture.jpg");
        int i[] [] = loadResource ("a6/MyPicture.jpg");
        for (int x = 0; x< p.length-1; x++ ) {
            p[x] = i[p.length-1 -x];
        }
        
        show(p);
            
    }
}
