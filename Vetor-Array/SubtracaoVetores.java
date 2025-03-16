package exercicio;

import java.util.Scanner;	

public class Exercicio_C {

	public static void main(String[] args) {
			
	Scanner scn = new Scanner(System.in);
			
	int i = 0; 
	int matrizA[] = new int[20];
	int matrizB[] = new int[20];
	int matrizC[] = new int[20];
	
	
	for(i = 0; i < 20 ; i++) {
		System.out.println("Insira um valor: ");
		matrizA[i] = scn.nextInt();
	}
	for(i = 0; i < 20 ; i++) {
		System.out.println("Insira um valor: ");
		matrizB[i] = scn.nextInt();
	}
	for(i = 0; i < 20 ; i++) {
		matrizC[i] = matrizA[i] - matrizB[i];
		System.out.println((i+1)+"º \t" + matrizA[i] +"  -  "+ matrizB[i]+ "  =  " + matrizC[i] );
		
	}
	scn.close();
	}

}
