import java.util.Scanner;
public class Juros1806 {

	public static void main(String[] args) {
		Scanner serasalol = new Scanner (System.in);
		double valorEmprestimo, JUROS=2.5, meses, valorJuros, prest, liquidValor;
		System.out.println("Insira o valor do empr�stimo: ");
		valorEmprestimo = serasalol.nextDouble();
		System.out.println("Insira o tempo (em meses) em que deseja pagar: ");
		meses = serasalol.nextDouble();
		valorJuros = valorEmprestimo/100*JUROS;	
		prest = valorEmprestimo/meses+valorJuros;		
		System.out.println("A presta��o ser� de "+prest+" reais");
		liquidValor = prest * meses;
		System.out.println("O valor liquidado ser� de "+liquidValor+" reais");
		serasalol.close();	
	}
}
