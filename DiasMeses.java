import java.util.Scanner;
public class DiasMeses {

	public static void main(String[] args) {
	Scanner calendario = new Scanner (System.in);
	int idade, dias, meses;
	
	System.out.println("Digite sua idade: ");
	idade = calendario.nextInt();
	
	calendario.close();
	
	dias = idade * 365;
	meses = idade * 12;
	
	System.out.println("Voc� nasceu a: " +dias+ " dias");
	System.out.println("Desde l�, se passaram: " +meses+ " meses");
	System.out.println("Feliz anivers�rio !!!");
	}

}
