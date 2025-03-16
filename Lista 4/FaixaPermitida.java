package exercicios;

import java.util.Scanner;

public class faixa_permitida__exerc_k {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		int var1 = scn.nextInt();
		
		if (var1 <= 9 && var1 >= 1) {	
			System.out.println("o valor está dentro da faixa permitida");
		}
		else {
			System.out.println("O valor está fora da faixa permitida");
		}
		scn.close();
		
	}

}
