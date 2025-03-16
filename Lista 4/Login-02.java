package aula10;

import java.util.Scanner;

public class login02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Sistema de login...\n\n");
		System.out.println("Digite o usuário: ");
		String user = scn.next();
		
		if(user.equals("senai")) {
			System.out.println("Usuário válido");
		}
		else {
			System.out.println("Usuário inválido");
		}
		scn.close();
	}
	
}
