package aula10;

import java.util.Scanner;

public class login03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Sistema de login...\n\n");
		System.out.println("Digite o usuário: ");
		String user = scn.next();	
		System.out.println("Digite a SENHA: ");
		int senha = scn.nextInt();
		
		if(user.equals("senai") && senha == 1234 ) {
			System.out.println("Usuário válido");
		}
		else {
			System.out.println("Usuário inválido");
		}
		scn.close();
		
	}

}
