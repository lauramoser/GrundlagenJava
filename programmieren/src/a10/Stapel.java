package a10;
import java.util.Vector;
public class Stapel {

	
		public Vector<String> vec;
		public int x;
		public String name;
		
		
		public Stapel() {		
			name = "";
			vec = new Vector <String>();
		}

		public static void main(String[] args) {
			Stapel st = new Stapel();
			try {
				st.push("apfel");
				System.out.println(st.toString());
			} catch (Exception e) {
				System.out.println("Fehler");
				e.printStackTrace();
			}
			
		}

		public void push (String obererWert){
			vec.add(obererWert);
			
		}

		public String pull() throws Exception {
			
			if (vec.size() == 0) {
				throw new Exception();
			}
			
			String s = vec.lastElement();
			vec.remove(vec.size()-1);
			
			return s;
		}
		
		public String toString() {
			String s = "";
			for (int i= 0; i< vec.size(); i++) {
				String x = "" + vec.elementAt(i) + ",";
				s = s+x; 
			}
			return s;
		}
		
		public boolean equals(Stapel sp) {
			if (vec.size() != sp.vec.size())
				return false;
			if (vec.size() == sp.vec.size()) {
				for(int i = 0; i<vec.size(); i++){
					if (vec.elementAt(i) != sp.vec.elementAt(i)) {
						return false;
					}
				}
			}
			return true; 
		}
		
		public Stapel clone() {
			Stapel st = new Stapel();
			for(int i =0; i<vec.size(); i++) {
				st.push(name);
			}
			
			
			return st;
		}
	}

