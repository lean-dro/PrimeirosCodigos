import java.util.Scanner;
public class SalarioMinimo {

	public static void main(String[] args) {
	Scanner contador = new Scanner(System.in);
	double sal, SALMIN=954.00;
	
	System.out.println("Digite o valor de seu sal�rio: ");
	sal = contador.nextDouble();
	
	System.out.println("O valor de seu sal�rio �: " +sal+" reais");
	
	if (sal<SALMIN) {
		System.out.println("Seu sal�rio � abaixo do sal�rio m�nimo");
	}
	else if (sal>SALMIN) {
		System.out.println("Seu sal�rio � acima do sal�rio m�nimo");
	}	
	else {
		System.out.println("Seu sal�rio � min�mo");
	}
	contador.close();
	}
}
