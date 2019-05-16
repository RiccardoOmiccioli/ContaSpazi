import java.util.Scanner;

public class ContaSpazi {
	public static void main( String [] args ) {
		
		int contatore = 0; // contatore degli spazi
		int i = 0;
		
		Scanner input = new Scanner ( System.in );
		
		System.out.print( "Inserisci una riga di testo: " );
		String stringa = input.nextLine();
		
		while ( i != -1 ) {
			i = stringa.indexOf( ' ', i + 1 ); //Restituisce -1 se non trova altri caratteri di spazio (Non è possibile usare i++)
			if ( i != -1 ) contatore++;
		}
		
		System.out.println( "Numero di spazi trovati: " + contatore );
		
		input.close();
	}
}
