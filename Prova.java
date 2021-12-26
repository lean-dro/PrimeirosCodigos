import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Entre com um valor: ");
		a = in.nextInt();
		
		if (a % 3 == 0) {
			System.out.println(a);
		}
		else {
			System.out.println("Valor não atende aos requisitos");
		}
	}
	

}
