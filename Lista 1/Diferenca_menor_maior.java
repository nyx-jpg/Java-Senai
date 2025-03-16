package Segunda_lista;

import java.util.Scanner;

public class Diferenca_menor_maior {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
	
		System.out.print("Insira um valor inteiro: ");
		int varA = scn.nextInt();
		
		System.out.print("Insira outro valor inteiro:");
		int varB = scn.nextInt();
		

		if (varA > varB) {
			System.out.println("A diferença entre o maior valor pelo menor valor é: " + (varA-varB));
		}
		else {
			System.out.println("A diferença entre o maior valor pelo menor valor é: " + (varB-varA));
		}
		scn.close();
	}

}