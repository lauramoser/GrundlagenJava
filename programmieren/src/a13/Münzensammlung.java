package a13;
import java.util.Enumeration;
import java.util.Hashtable;
public class M�nzensammlung  {

	Hashtable<M�nzart, Integer> tabelle = new Hashtable<M�nzart,Integer>();
	

	public M�nzensammlung() {
	}
	
	public void setM�nze(M�nzart m, int anzahl) {
		tabelle.put(m, anzahl);
	}

	public int getM�nze(M�nzart m) {
		 return tabelle.get(m);
	}
	
	public String toString() {
		String s ="";
		for(M�nzart m: M�nzart.values()) {
			if (tabelle.get(m)!=null&&tabelle.get(m)!=0) {
				s=s+m.name+""+getM�nze(m)+"St�ck\n";
			}
		}
		return s;
		
	}
	
	public int wert() {
		int summe= 0;
		for(M�nzart m: M�nzart.values()) {
			if(tabelle.get(m)!=null)
				summe = summe + getM�nze(m) + m.getWert();
		}
		
		return summe;
	}
	public M�nzensammlung(int centbetrag) {
		tabelle = new Hashtable<M�nzart,Integer>();
		for(M�nzart m:M�nzart.values()) {
			int z�hler = 0;
			while(centbetrag-m.getWert()>=0) {
				
				centbetrag=centbetrag-m.getWert();
				z�hler++;
			}
			setM�nze(m,z�hler);
			z�hler=0;
		}		
	}
	
	public M�nzensammlung(int centbetrag,M�nzensammlung y) throws Exception {
		tabelle = new Hashtable<M�nzart,Integer>();
		int z�hler = 0;
		int pr�fwert = centbetrag;
		
		if(y.wert()>=centbetrag){
			
			for(M�nzart m:M�nzart.values()) {
				while(centbetrag-m.getWert()>=0 && y.getM�nze(m)!=0) {
					
					centbetrag=centbetrag-m.getWert();
					z�hler++;
					y.setM�nze(m, y.getM�nze(m)-1);
				}
				setM�nze(m,z�hler);
				z�hler =0;
			}
			if (wert()!=pr�fwert) {
				throw new Exception("keine passenden M�nzen vorhanden!");
			}
			
		}else {
			throw new Exception("Geld reicht nicht.");
			
		}		
		
	}
	
	public void nominieren() {
		for(M�nzart m:M�nzart.values()) {
			int z�hler =0;
			int betrag =wert();
			while(betrag-m.getWert()>=0) {
				betrag=betrag-m.getWert();
				z�hler++;
			}
			setM�nze(m,z�hler);
			z�hler =0;
		}
		
	}
	public static M�nzensammlung r�ckgeld(int preis,M�nzensammlung hin, M�nzensammlung kasse)throws Exception{
		
		int gezahlt = hin.wert();
		int zur�ck = gezahlt - preis;
		
		if(zur�ck<0) {
			throw new Exception("Zu wenig Geld");
		}else {
			
			for(M�nzart m:M�nzart.values()) {
				int z�hler = kasse.getM�nze(m);
				while(gezahlt-m.getWert()>0) {
					gezahlt= gezahlt-m.getWert();
					hin.setM�nze(m,hin.getM�nze(m)-1);
					z�hler++;
				}
				kasse.setM�nze(m,z�hler);
			}
		}
		M�nzensammlung a = new M�nzensammlung(zur�ck, kasse);
		return a;
	}
	
}
	
	
	

