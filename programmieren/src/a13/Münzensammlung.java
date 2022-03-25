package a13;
import java.util.Enumeration;
import java.util.Hashtable;
public class Münzensammlung  {

	Hashtable<Münzart, Integer> tabelle = new Hashtable<Münzart,Integer>();
	

	public Münzensammlung() {
	}
	
	public void setMünze(Münzart m, int anzahl) {
		tabelle.put(m, anzahl);
	}

	public int getMünze(Münzart m) {
		 return tabelle.get(m);
	}
	
	public String toString() {
		String s ="";
		for(Münzart m: Münzart.values()) {
			if (tabelle.get(m)!=null&&tabelle.get(m)!=0) {
				s=s+m.name+""+getMünze(m)+"Stück\n";
			}
		}
		return s;
		
	}
	
	public int wert() {
		int summe= 0;
		for(Münzart m: Münzart.values()) {
			if(tabelle.get(m)!=null)
				summe = summe + getMünze(m) + m.getWert();
		}
		
		return summe;
	}
	public Münzensammlung(int centbetrag) {
		tabelle = new Hashtable<Münzart,Integer>();
		for(Münzart m:Münzart.values()) {
			int zähler = 0;
			while(centbetrag-m.getWert()>=0) {
				
				centbetrag=centbetrag-m.getWert();
				zähler++;
			}
			setMünze(m,zähler);
			zähler=0;
		}		
	}
	
	public Münzensammlung(int centbetrag,Münzensammlung y) throws Exception {
		tabelle = new Hashtable<Münzart,Integer>();
		int zähler = 0;
		int prüfwert = centbetrag;
		
		if(y.wert()>=centbetrag){
			
			for(Münzart m:Münzart.values()) {
				while(centbetrag-m.getWert()>=0 && y.getMünze(m)!=0) {
					
					centbetrag=centbetrag-m.getWert();
					zähler++;
					y.setMünze(m, y.getMünze(m)-1);
				}
				setMünze(m,zähler);
				zähler =0;
			}
			if (wert()!=prüfwert) {
				throw new Exception("keine passenden Münzen vorhanden!");
			}
			
		}else {
			throw new Exception("Geld reicht nicht.");
			
		}		
		
	}
	
	public void nominieren() {
		for(Münzart m:Münzart.values()) {
			int zähler =0;
			int betrag =wert();
			while(betrag-m.getWert()>=0) {
				betrag=betrag-m.getWert();
				zähler++;
			}
			setMünze(m,zähler);
			zähler =0;
		}
		
	}
	public static Münzensammlung rückgeld(int preis,Münzensammlung hin, Münzensammlung kasse)throws Exception{
		
		int gezahlt = hin.wert();
		int zurück = gezahlt - preis;
		
		if(zurück<0) {
			throw new Exception("Zu wenig Geld");
		}else {
			
			for(Münzart m:Münzart.values()) {
				int zähler = kasse.getMünze(m);
				while(gezahlt-m.getWert()>0) {
					gezahlt= gezahlt-m.getWert();
					hin.setMünze(m,hin.getMünze(m)-1);
					zähler++;
				}
				kasse.setMünze(m,zähler);
			}
		}
		Münzensammlung a = new Münzensammlung(zurück, kasse);
		return a;
	}
	
}
	
	
	

