package exercicio;

import java.util.Scanner;

public class exercicio_F {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		int i = 0;
		int A[] = new int [15];
		int B[]	= new int [15];
		int C[]	= new int [30];
		
		
		System.out.println("Informe 15 valores para vetor A");
		for(i = 0 ; i < 15 ; i++) {
			System.out.println((i+1)+"º número: ");
			A[i] = scn.nextInt();
			
		}
		System.out.println("Informe 15 valores para vetor B");
		for(i = 0 ; i < 15 ; i++) {
			System.out.println((i+1)+"º número: ");
			B[i] = scn.nextInt();
			
		}
		for(i = 0 ; i < 15 ; i++) {
			C[i] = A[i];	
		}
		for(i = 0 ; i < 15 ; i++) {
			C[15 + i] = B[i];
		}
		System.out.println("\n\n");
		for(i = 0 ; i < 30 ; i++) {
			System.out.println(C[i]);
		}
		scn.close();
	}

}
