package exercicios;

import java.util.Scanner;

public class exercicio_E {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		
		int i = 0;
		int matrizA[] = new int [15];
		int matrizB[] = new int [15];
		
		
		for(i = 0 ; i < 15 ; i++) {
			System.out.println("Informe o "+(i+1)+"º "+"número: ");
			matrizA[i] = scn.nextInt();
			matrizB[i] = 1;
		
		for(int y = 1 ; y <= matrizA[i] ; y++) {
			matrizB[i] = matrizB[i]*y;
		}
		}
		for(i= 0 ; i < 15 ; i++) {
			System.out.println("O fatorial de " + matrizA[i] + " é = " +matrizB[i]);
		}
		scn.close();
	}

}
