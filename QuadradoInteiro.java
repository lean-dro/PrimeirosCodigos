
import java.util.Scanner;

public class QuadradoInteiro {

	public static void main(String[] args) {
		Scanner observe = new Scanner(System.in);
		
		int numeroUm, numeroDois, numeroTres, soma, q1, q2, q3;
		
		System.out.println("Digite o primeiro número:");
		numeroUm = observe.nextInt();
		
		System.out.println("Digite o segundo número:");
		numeroDois = observe.nextInt();
		
		System.out.println("Digite o terceiro número:");
		numeroTres = observe.nextInt();
		
		observe.close();
		
		q1 = numeroUm * numeroUm;
		
		q2 = numeroDois * numeroDois;
		
		q3 = numeroTres * numeroTres;
		
		soma = q1 + q2 + q3;
		
		System.out.println("A soma dos quadrados é:" +  soma);		
		
		
		

	}

}
