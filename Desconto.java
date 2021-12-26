import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		Scanner liquidificador = new Scanner (System.in);
		double precoReal, pd, pf, desconto;
		
		System.out.println("Digite o valor do produto: ");
		precoReal = liquidificador.nextDouble();
		
		System.out.println("Digite o desconto: ");
		pd = liquidificador.nextDouble();
		
		liquidificador.close();
		
		desconto = precoReal/100*pd;
		
		pf=precoReal-desconto;
		
		System.out.println("O valor com o desconto de " +desconto+"% "+"custa "+pf+" reais");
		
	}

}
