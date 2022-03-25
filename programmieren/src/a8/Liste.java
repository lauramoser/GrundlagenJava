package a8;

public class Liste {

	  	public int element;
	    public Liste nachfolger;
	    public Liste (int w) {
	        element = w;
	        nachfolger = null;
	    }
	    
	    public void hinzufuegen (int w) {
	        if (nachfolger == null)
	            nachfolger = new Liste(w);
	        else
	            nachfolger.hinzufuegen(w);
	    }
	    
	    public int laenge () {
	        if ( nachfolger == null ) {
	            return 1;
	        }
	        return 1 + nachfolger.laenge();
	    }
	    
	    public void entfernen () {
	        if(nachfolger.laenge() == 1) {
	            nachfolger = null;        
	        }
	        else 
	            nachfolger.entfernen();                    
	    }
	    
	    public String toString() {
	    String s = "";
	        if ( nachfolger == null) {
	            s = (""+ element );
	            return s;
	        }
	        return element+  ","  +nachfolger.toString();
	    }
	    
	    public int summe () {
	        int summe = 0;
	        if (nachfolger == null) {
	            summe = summe + element;
	            return summe;
	        }
	        return element + nachfolger.summe();
	    }
	    
	    public void addiere (int z) {
	        if (nachfolger == null) {
	            element = element + z;
	        }
	        else {
	            nachfolger.addiere(z);
	            element = element + z;
	        }
	    }
	}



	   