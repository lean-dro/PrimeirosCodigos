
import java.util.Scanner;
public class Transferir {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, gaveta;
		
		System.out.println("Digite A:");
		a= leia.nextInt();
		
		System.out.println("Digite B:");
		b= leia.nextInt();
		
		leia.close();
		
		
		gaveta = a;
		a = b;
		b = gaveta;
		System.out.println("A � igual a: "  +  a);
		System.out.println("B � igual a: "  +  b);
			
		

	}

}
