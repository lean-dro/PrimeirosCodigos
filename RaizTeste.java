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
			System.out.println("A primeira raiz é: "+ x1);
			System.out.println("A segunda raiz é: "+ x2);
		}	
		else if (delta == 0) {
			x1 =  (-b - raiz)/(2*a);
			
			System.out.println("A raiz é: " +x1);
		}	
		else {
			System.out.println("Não existem raizes reais para a equação");
		}
		in.close();
		xV = (-b)/2*a;
		System.out.println(xV);
		yV = -(delta)/4*a;
		System.out.println(yV);
	}
}
