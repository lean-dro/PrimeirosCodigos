import java.util.Scanner;
public class SalarioMinimo {

	public static void main(String[] args) {
	Scanner contador = new Scanner(System.in);
	double sal, SALMIN=954.00;
	
	System.out.println("Digite o valor de seu salário: ");
	sal = contador.nextDouble();
	
	System.out.println("O valor de seu salário é: " +sal+" reais");
	
	if (sal<SALMIN) {
		System.out.println("Seu salário é abaixo do salário mínimo");
	}
	else if (sal>SALMIN) {
		System.out.println("Seu salário é acima do salário mínimo");
	}	
	else {
		System.out.println("Seu salário é minímo");
	}
	contador.close();
	}
}
