package exercicios;

import java.util.Scanner;

public class nome_e_sexo__exerc_m {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	//
	System.out.print("Informe seu nome: ");
	String name = scn.next();
	
	System.out.print("Informe seu sexo, M ou F: ");
	String sexo = scn.next();
	
	//
	if(sexo.equals("M") || sexo.equals("m") ) {
		System.out.printf("Olá Sr %s ",name);
	}
	if(sexo.equals("F") || sexo.equals("f")) {
		System.out.printf("Olá Sra %s ",name);
	}
	else if (! sexo.equals("M") || sexo.equals("m") || sexo.equals("F") || sexo.equals("f")) {
		System.out.println("O sexo informado é inválido!");
	}
	scn.close();
 }

}
