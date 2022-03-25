package a11;

public class Arzt extends Mitarbeiter {
	
	int buerozimmernummer;
	public Rang rang;
	public Arzt( String v, String n, Geschlecht g, Anrede a, int id, int gh, int bzn, Rang r) {
		super(v,n,g,a,id,gh);
		buerozimmernummer = bzn;
		rang = r;
	}

	public String ansprache() {
		
		switch(rang) {
		
		case ASSISTENZARZT:
			if(anrede == Anrede.FRAU)
				return "Assistenzärztin" + vorname + nachname;
				return "Assistenzazt" + vorname + nachname;
					
		case FACHARZT:
			if(anrede==Anrede.FRAU)
				return "Fachärztin" + vorname + nachname;
				return "Facharzt" + vorname + nachname;
				
		case OBERARZT:
			if(anrede==Anrede.FRAU)
				return "Oberärztin" + vorname + nachname;
				return "Oberarzt"+ vorname + nachname;
		
		case LEITENDER_OBERARZT:
			if(anrede==Anrede.FRAU)
				return "Leitende-Oberärztin" + vorname + nachname;
				return "Leitender-Oberarzt"+ vorname + nachname;
			
		case CHEFARZT:
			if(anrede==Anrede.FRAU)
				return "Chefärztin" + vorname + nachname;
				return "Chefarzt"+ vorname + nachname;
				
		case DIREKTOR:
			if(anrede==Anrede.FRAU)
				return "Direktorin" + vorname + nachname;
				return "Direktor"+ vorname + nachname;
		
		default:
				return"Kein/e Arzt/Ärztin";
		}
	}
	
	public boolean rangHoeherAls( Arzt x) {
		
		if(rang.ordinal() > x.rang.ordinal())
			return true;
		
		return false; 
		
	}
	
}
