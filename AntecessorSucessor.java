
import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		
		int numero, sucessor, antecessor;
		
		System.out.println("Digite seu n�mero:");
		numero = analise.nextInt();
		
		analise.close();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		
		System.out.println("O sucessor � :" + sucessor);
		System.out.println("O n�mero � :" + numero);
		System.out.println("O antecessor � :" + antecessor);
	}

}
