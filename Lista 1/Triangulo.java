package Segunda_lista;

import java.util.Scanner;

public class tria {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		

		

		System.out.println("Defina um valor para A:");
		int A = scn.nextInt();

		System.out.println("Defina um valor para B:");
		int B = scn.nextInt();

		System.out.println("Defina um valor para C:");
		int C = scn.nextInt();

		if(B-C<A && A< B + C && A-C<B && B< A + C && A-B<C && C< A + B ) {
			System.out.println("É um triângulo");
		
		}
		if (A == B || B == C) {
			System.out.println("É um triângulo isósceles");
		}
		if (A != B && B != C) {
			System.out.println("É um triângulo escaleno");
		}
		if( A == B && A == C){
			System.out.println("É um triângulo equilátero");
		}
		tcld.close();
		
	}

}
