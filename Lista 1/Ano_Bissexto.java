package Segunda_lista;

import java.util.Scanner;


public class ano_bissexto {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Insira um ano: ");
		int ANO = scn.nextInt();
		if (ANO % 4 == 0 || ANO % 400 == 0) {
			System.out.println("O ano informado é bissexto");
		}
		else {
			System.out.println("O ano iformado não é bissexto!");
		}
		scn.close();
		
	}

}