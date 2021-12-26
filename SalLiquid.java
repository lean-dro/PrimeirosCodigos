import java.util.Scanner;
public class SalLiquid {

	public static void main(String[] args) {
		Scanner dinheiro = new Scanner (System.in);
		double salbase, gratif, salbruto, ir, salliquido;
		
		System.out.println("Entre com o salário base:");
		salbase = dinheiro.nextDouble();
		
		System.out.println("Entre com o gratif:");
		gratif = dinheiro.nextDouble();
		
		salbruto = salbase + gratif;
		
		if (salbruto < 1000) {
			ir = (15/100)*salbruto;
		}
		else {
			ir = (20/100)*salbruto;
		}
		salliquido = salbruto - ir;
		System.out.println(salliquido);
	}
}
