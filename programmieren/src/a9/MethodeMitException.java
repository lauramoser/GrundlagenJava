package a9;
import java.util.StringTokenizer; // ich will nur mit StringTokenizer arbeiten
public class MethodeMitException {

	public static void main (String[] args) {
        try {
            System.out.println(auswerten("2+4-8"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static int f (int x[]) throws Exception {
    
        
        for(int i=0; i<x.length; i++) {
            if (x[i] > x[i+1])
                return x[i];
                
        }
        throw new Exception();
    
    }
    
    public static int auswerten (String x) throws Exception{
        
        StringTokenizer st = new StringTokenizer(x,"+-", true);
        String token = "";
        int ergebnis = 0;
        
        boolean lastTokenMinus = false;
        boolean lastTokenPlus = false;
        
        boolean ersterWert = true;
        
        while (st.hasMoreTokens()) {       
            token = st.nextToken();
            
            try {
                int valueOfToken;
                
                
                valueOfToken = Integer.parseInt(token);
                if(ersterWert) {
                    ergebnis += valueOfToken;
                    ersterWert = false;
                }
                if (lastTokenPlus) {           
                    ergebnis += valueOfToken;
                    lastTokenPlus = false;     
                }
                else if (lastTokenMinus) {
                    ergebnis -= valueOfToken;   
                    lastTokenMinus = false;
                }
            }
            catch (NumberFormatException nfe) {
                if(token.equalsIgnoreCase("+")) {       
                    if (lastTokenPlus || lastTokenMinus) {
                        throw new Exception("Fall 2: In der Zeichenkette stehen unmittelbar hintereinander mehrere Operatoren (+,-),");
                    }
                    lastTokenPlus = true;
                }
                else if (token.equalsIgnoreCase("-")) { 
                   
                    if (lastTokenPlus || lastTokenMinus) {
                        throw new Exception("Fall 2: In der Zeichenkette stehen unmittelbar hintereinander mehrere Operatoren (+,-),");
                    }
                    lastTokenMinus = true;
                }
                else {                                    
                    throw new Exception("Fall 1: Zeichenkette enthält nicht zulässige Zeichen");
                }
            }
            }
            if (lastTokenPlus || lastTokenMinus) {
                throw new Exception("Fall 3: Die Zeichenkette endet mit einem Operator");
            }
            
            return ergebnis;
        }
}
