package Segunda_lista;

import java.util.Scanner;

public class raiz_quadrada_ou_cubica {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		

		System.out.println("Insira um valor: ");
		int N1 = tcld.nextInt();
		

		if(N1 != 5 && N1 > 0) {
			System.out.println("A raiz quadrada desse valor é: "+ Math.sqrt(N1));
		}
		if(N1 == 5 && N1 > 0 ) {
			System.out.println("O valor da raiz cúbica é: " + Math.cbrt(N1));
		}
		if (N1 < 0) {
			System.out.println("fim");
		}
		scn.close();
	}
	

}
