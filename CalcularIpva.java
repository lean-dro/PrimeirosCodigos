import java.util.Scanner;

public class CalcularIpva {

	public static void main(String[] args) {
	Scanner detran = new Scanner(System.in);
	double veiculo, IPVA=4, resultado;
	
	System.out.println("Digite o valor do veículo: ");
	veiculo = detran.nextDouble();
	
	detran.close();
	
	resultado = (veiculo * (IPVA/100));
	
	System.out.println("O valor do IPVA é :" + resultado);
	
	}

}
