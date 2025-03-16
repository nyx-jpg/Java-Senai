package segunda_lista;

import java.util.Scanner;


public class conversoes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		

		System.out.print("Informe um valor em Reais: ");
		double real = scn.nextDouble();
		
		System.out.println("Opções de conversão: \n dólar, euro, libra_esterlina e peso_argentino");
		String opcao = tcld.next();
		
		System.out.println("informe a taxa de câmbio da opção escolhida:");
		double taxa = tcld.nextDouble();
		
		
		double dolar = real / taxa;
		double libra = real * taxa;
		double euro = real * taxa;
		double peso_arg = real * taxa;
		
		
		if (opcao.equals("dólar")) {
			System.out.printf(" O valor em doláres é U$ %.2f ",dolar);
		}
		if (opcao.equals("euro")) {
			System.out.printf(" O valor em euros é € %.2f",euro);
		}
		if (opcao.equals("libra_esterlina")) {
			System.out.printf(" O valor em libras esterlinas é £ %.2f",libra);
		}
		if (opcao.equals("peso_argentino")) {
			System.out.printf(" O valor em pesos argentinos é $ %.2f",peso_arg);
		}
		scn.close();
		
	
	}

}