
import java.util.Scanner;

public class Mistureba {

	public static void main(String[] args) {
		
			Scanner eu = new Scanner(System.in);
			
			String nome1;
			String crush;
			
			String resultado;
			
			System.out.println("Metade do seu nome: ");
			nome1 = eu.next();
			
			System.out.println("Metade do nome do(a) crush: ");
			crush = eu.next();
			
			eu.close();
			
			resultado = nome1 + crush;
			
			System.out.println("A mistura é " + resultado);	
		
	}

}
