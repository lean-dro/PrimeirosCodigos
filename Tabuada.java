
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner calc = new Scanner (System.in);
		
		int numero , resultado;
		
		System.out.println("Digite seu número: ");
		numero = calc.nextInt();
		
		calc.close();
		
		resultado = numero*1;
		System.out.println(numero+"*1="+resultado);
		resultado = numero*2;
		System.out.println(numero+"*2="+resultado);
		resultado = numero*3;
		System.out.println(numero+"*3="+resultado);
		resultado = numero*4;
		System.out.println(numero+"*4="+resultado);
		resultado = numero*5;
		System.out.println(numero+"*5="+resultado);
		resultado = numero*6;
		System.out.println(numero+"*6="+resultado);
		resultado = numero*7;
		System.out.println(numero+"*7="+resultado);
		resultado = numero*8;
		System.out.println(numero+"*8="+resultado);
		resultado = numero*9;
		System.out.println(numero+"*9="+resultado);
		resultado = numero*10;
		System.out.println(numero+"*10="+resultado);
	}

}
