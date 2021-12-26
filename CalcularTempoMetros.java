import java.util.Scanner;

public class CalcularTempoMetros {
	public static void main (String [] args) {
		Scanner fita = new Scanner (System.in);
		double metros, tempo;
		
		System.out.println("Digite o instante: ");
		tempo = fita.nextDouble();
		
		fita.close();
		
		metros = tempo*600;
		
		System.out.println("A distância percorrida nesse instante é: " +metros+"m");
	
	
	
	
	
	}

}
