package exercicios;

import java.util.Scanner;

public class Exercicio_B {

	public static void main(String[] args) {
		
	int i = 0; 
	int matrizA[] = new int[8]; 
	int matrizB[] = new int[8]; 
							
	
	for(i = 0; i < 8; i++) {
		System.out.println("Informe um valor inteiro: ");
		matrizA[i] = scn.nextInt();
		matrizB[i] = matrizA[i] * 3;
	}
	for(i = 0; i < 8; i++) {
		System.out.println(matrizA[i] + " x 3 =" + matrizB[i]);
	}
		scn.close();					
							
	}

}
