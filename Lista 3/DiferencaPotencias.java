package aula_06;

import java.util.Scanner;

public class exercicio_j {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
	    System.out.println("Digite um Número");
		int base = scn.nextInt();
		
	    System.out.println("Digite outro Número");
		int base2 = scn.nextInt();
		
		double resultado1 = Math.pow(base,base);
		
		double resultado2 = Math.pow(base2,base2);

		
		System.out.println("A Diferença é" + (resultado1 - resultado2));
	}

}
