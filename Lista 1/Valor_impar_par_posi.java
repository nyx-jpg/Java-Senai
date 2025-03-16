package segunda_lista;

import java.util.Scanner;


public class Valor_impar_par_posi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Insira um valor: ");
		int N1 = scn.nextInt();
		
		
		if (N1 % 2 == 0 && N1>0) {
			System.out.printf("O valor fornecido " +N1 + " é par e positivo");
		}
		if (N1 % 2 == 1 && N1>0) {
			System.out.print("O valor fornecido " +N1+ " é impar e positivo");
		}
		
		if (N1 % 2 == -1 && N1<0){
			System.out.print("O valor fornecido " +N1+ " é impar e negativo");
		}	
		if (N1 % 2 == 0 && N1<0) {
			System.out.print("O valor fornecido " +N1+ " é par e negativo");
		}
		
		scn.close();
	}

}
