import java.util.Scanner;
import java.lang.Math;
public class RaizTeste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		double a, b, c, delta, raiz, x1, x2,xV,yV;
		
		System.out.println("Insira o valor de a: ");
		a = in.nextDouble();
		
		System.out.println("Insira o valor de b: ");
		b = in.nextDouble();
		
		System.out.println("Insira o valor de c: ");
		c = in.nextDouble();
		
		delta = b*b-4*a*c;
		raiz = Math.sqrt(delta);
		System.out.println(delta);
		if (delta > 0) {
			x1 = (-b - raiz)/(2*a);
			x2 = (-b + raiz)/(2*a);
			System.out.println("A primeira raiz �: "+ x1);
			System.out.println("A segunda raiz �: "+ x2);
		}	
		else if (delta == 0) {
			x1 =  (-b - raiz)/(2*a);
			
			System.out.println("A raiz �: " +x1);
		}	
		else {
			System.out.println("N�o existem raizes reais para a equa��o");
		}
		in.close();
		xV = (-b)/2*a;
		System.out.println(xV);
		yV = -(delta)/4*a;
		System.out.println(yV);
	}
}
