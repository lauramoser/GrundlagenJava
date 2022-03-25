package a7;
import static prog.ConsoleReader.*;
public class Tageszeit {

	 public int stunden;
	    public int minuten;
	    public int sekunden;
	    public boolean ampm = false;
	    
	    public Tageszeit(int s, int m, int sk) {
	        stunden = Math.abs(s % 24);                //dann gibt es keinen Rest und es geht nicht ber die normale Uhrzeit drüber
	        minuten = Math.abs(m % 60);
	        sekunden = Math.abs(sk % 60);
	    }
	    public Tageszeit( int s, int m) {
	        stunden  = Math.abs(s % 24);    
	        minuten = Math.abs(m % 60);
	        sekunden = 0;    
	    }
	    
	    public int sekundenseitMitternacht () {
	        int ssk = stunden * 60 * 60;
	        int msk = minuten *60;
	        
	        return ssk + msk + sekunden;
	    }
	    
	    public boolean vormittags () {
	        boolean vormittags = false;
	        if (stunden< 12) {
	            vormittags = true;
	            }
	        
	        return vormittags;        
	    }
	    
	    public String toString() {
	        int stundenpm = stunden - 12;
	        if(stunden > 12) {
	            String s = ("" + stundenpm + ":" + minuten + "." + sekunden + "pm");
	             ampm = true;
	        }
	            String s = ("" + stunden + ":" + minuten + "." + sekunden + "am");
	            ampm = false;
	        
	        
	        return s;
	    }
	    
	    public void vorstellen (int s, int m, int sk) {
	        if (sekunden + sk > 60) {
	            sekunden = sekunden +sk - 60;
	            minuten++;
	        }
	            else {
	            sekunden = sekunden + sk;
	        }
	        
	        if (minuten + m > 60) {
	            minuten = minuten + m - 60;
	            stunden++;
	        }
	            else {
	            minuten = minuten + m;
	        }
	        
	        if (stunden + s >= 24) {
	            stunden = stunden + s -24;
	            
	        }
	        else { stunden = stunden +s;
	        
	        }
	    }
	    
	    public boolean istFrueherAls ( int s, int m, int sk) {
	        int neu = (s*60*60)+(m*60)+s;
	        boolean istFrueherAls = false;
	        
	        if( sekundenseitMitternacht()<neu ) {
	            istFrueherAls = true;
	            }
	        return istFrueherAls;
	    }
	    
	    
	        
	    
	
	 
}
