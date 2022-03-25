package bootcamp;
import static prog.ConsoleReader.*;
import java.util.*;
public class hangman {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Erster Spieler gebe ein Wort ein");
		String Wort = readString();
		int Wortlaenge = Wort.length();
		int übrigeMöglichkeiten = 10;
		int richtigerBuchstabe = 0;
		char allebuchstaben[] = new char[Wort.length()];
		
		for (int i = 0; i < allebuchstaben.length; i++) {
			allebuchstaben[i] = '_';
		}
		
	
		for(int a=0; a < Wortlaenge; a++) {
			System.out.print(" _ ");
		}
		System.out.println(" ");
		System.out.println("Zweiter Spieler gebe ein Buchstabe ein");
		
		while( übrigeMöglichkeiten > 0 && richtigerBuchstabe <= Wort.length() ) {
			char Buchstabe = sc.next().charAt(0);
			boolean buchstabe = false;
			for(int x=0; x < Wortlaenge; x++) {
				if( Buchstabe == Wort.charAt(x)) {
					buchstabe = true;
					richtigerBuchstabe++;
					allebuchstaben[x] = Buchstabe;
				}
				
				System.out.print(allebuchstaben[x]+" ");
				
			}
			
			System.out.println();
			
			if ( buchstabe == false) {
				System.out.println("falsch");
				übrigeMöglichkeiten--;
				System.out.println(" du hast noch " + übrigeMöglichkeiten + " Versuche " );
			}
		}
				
	}
	}			
			


