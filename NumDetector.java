import java.util.Scanner;
public class NumDetector {

	public static void main(String[] args) {
	Scanner info = new Scanner(System.in);
	int num;		
	System.out.println("Digite o n�mero: ");
	num = info.nextInt();		
	System.out.println("Seu n�mero �: " + num);
	if (num>0) {
			System.out.println("O n�mero � positivo");
			}
	else if (num<0) {
			System.out.println("O n�mero � negativo");
			}
	else {
			System.out.println("O n�mero � neutro");
		}
		info.close();
	}
}
