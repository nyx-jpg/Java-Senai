package Segunda_lista;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe um valor:");
		int N1 = scn.nextInt();
		
		System.out.println("Informe outro valor:");
		int N2 = scn.nextInt();

		System.out.println("Escolha uma opção:  \n Somar \n Subtrair \n Multiplicar \n Dividir");
		String opcao = scn.next();
		
		

		if (opcao.equals("Somar")) {
			System.out.println(" O resultado é: " + (N1 + N2));
		}
		if (opcao.equals("Subtrair")) {
			System.out.println(" O resultado é: " + (N1 - N2));
	    }
		if (opcao.equals("Multiplicar")) {
			System.out.println(" O resultado é: " +  (N1 * N2));
		}
		if (opcao.equals("Dividir")) {
			System.out.println(" O resultado é: " +  (N1 / N2));
		}
		scn.close();
		
		
     }
}