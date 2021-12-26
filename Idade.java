
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoA, anoN, idad;
		
		System.out.println("Digite o ano atual:");
		
		anoA = leia.nextInt();
		
		System.out.println("Digite o ano do Nascimento:");
		
		anoN = leia.nextInt();
		
		leia.close();
		
		idad = anoA - anoN;
		System.out.println("A idade é: " + idad + " anos");

	}

}
