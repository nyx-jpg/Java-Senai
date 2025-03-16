package aula_06;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_l {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a quantidade em reais");
		
		double real = scn.nextDouble();
				
		System.out.println("Digite a cotação do dolar");
		
		double dolar = scn.nextDouble();
		
		System.out.println("O valor em reais seria = " + real * dolar);
		
		
	}

}
