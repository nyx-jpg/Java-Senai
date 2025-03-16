package aula_06;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_k {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o valor do dolar em R$");
		double dolar = scn.nextDouble();
		
		System.out.println("Digite a quantidade de dolar");
		int quantidade = scn.nextInt();
		
		
		System.out.println("O valor em reais seria = " + dolar * quantidade);
		
		
	}

}
