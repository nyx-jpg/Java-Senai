package aula10;

import java.util.Scanner;

public class login01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Sistema de login...\n\n");
		System.out.println("Digite o usuário: ");
		int user = scn.nextInt();
		
		if(user == 123456) {
			System.out.println("Usuário Válido");
		}
		else {
			System.out.println("Usuário inválido");
		}

		scn.close();
	}

}
