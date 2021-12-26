
import java.util.Scanner;

public class ConversorKm {

	public static void main(String[] args) {
		Scanner medida = new Scanner(System.in);
		
		double metros, kilometros;
		
		
		System.out.println("Digite a quantidade de metros:");
		metros = medida.nextDouble();
		
		medida.close();
		
		kilometros = metros / 1000;
		
		System.out.println("A quantidade de metros convertida em kilômetros é: " + kilometros+ " Km");
		

	}

}
