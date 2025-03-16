package exercicio;

import java.util.Scanner;

public class Exercicio_D {

	public static void main(String[] args) {
		
	Scanner scn = new Scanner(System.in);

	int i = 0;
	int matrizA[] = new int[15];
	int matrizB[] = new int[15];
	
	
	for(i = 0 ; i < 15 ; i++) {
		System.out.println("Informe um valor inteiro: ");
		matrizA[i] = scn.nextInt();
		matrizB[i] = (int)Math.pow(matrizA[i], 2);
	}
	for(i = 0 ; i < 15 ; i++) {
		System.out.println((i+1)+"º \t"+matrizA[i] + " ^ 2  =" + " \t" + matrizB[i] );
	}
	scn.close();
	}

}
