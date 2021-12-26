
import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		
		int numero, sucessor, antecessor;
		
		System.out.println("Digite seu número:");
		numero = analise.nextInt();
		
		analise.close();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		
		System.out.println("O sucessor é :" + sucessor);
		System.out.println("O número é :" + numero);
		System.out.println("O antecessor é :" + antecessor);
	}

}
