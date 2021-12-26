
import java.util.Scanner;
public class TempFtoC {

	public static void main(String[] args) {
	Scanner curitiba = new Scanner(System.in);
	int tempf, tempc;
	
	System.out.println("Insira a temperatura em °F:");
	tempf = curitiba.nextInt();
	
	tempc = (tempf-32)*5/9;
	
	System.out.println("A temperatura convertida em °C é: "+tempc+"°C");
	
	if (tempc<15) {
		System.out.println("Frio");
	}
	else if (tempc<22) {
		System.out.println("Ameno");
	}
	else {
		System.out.println("Calor");
	}
	curitiba.close();
	}
}
