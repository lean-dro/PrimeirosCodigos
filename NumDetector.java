import java.util.Scanner;
public class NumDetector {

	public static void main(String[] args) {
	Scanner info = new Scanner(System.in);
	int num;		
	System.out.println("Digite o número: ");
	num = info.nextInt();		
	System.out.println("Seu número é: " + num);
	if (num>0) {
			System.out.println("O número é positivo");
			}
	else if (num<0) {
			System.out.println("O número é negativo");
			}
	else {
			System.out.println("O número é neutro");
		}
		info.close();
	}
}
