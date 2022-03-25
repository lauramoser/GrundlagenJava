package a8;

public class Knoten {

	 private int x;
	    private Knoten links;
	    private Knoten rechts;
	    
	    
	    public Knoten(int w) {
	        x=w;
	        links = null;
	        rechts = null;
	    }
	    
	    public void einfuegen (int w) {
	        if ( x!= w) {
	            if (x>w) {
	                if(links == null) {
	                    links = new Knoten(w);
	                }
	                else {
	                    links.einfuegen(w);
	                }
	            }
	            else if  (x< w) {
	                if(rechts == null) {
	                    rechts = new Knoten(w);
	                }
	                else {
	                    rechts.einfuegen(w);
	                }
	            }
	        }
	    }
	    
	    public String toString() {
	        if(links == null && rechts == null)
	            return "(" + x + ")";
	            if(links ==null && rechts != null) 
	                return "(" + x +rechts.toString() +  ")";
	        if(links !=null && rechts == null)
	            return "(" + links.toString() + x + ")";
	        if(links !=null && rechts != null)
	            return "(" + links.toString() + x + rechts.toString() + ")";
	        return "";    
	    }
	    
	    public boolean suchen (int w) {
	        if(x == w)
	            return true;
	        if(rechts == null && links != null)
	            return links.suchen(w);
	        if(rechts == null && links == null)
	            return false;
	        if (links == null && rechts != null) 
	            return rechts.suchen(w);
	        if(rechts != null && links != null) {
	            if(rechts.suchen(w) == true)
	                return rechts.suchen(w);
	        else
	            return links.suchen(w);}
	                    return false;
	    }
	        
	    
}


