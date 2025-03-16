package aula_06;

import java.util.Scanner;


public class exercicio_i {

	public static void main(String[] args) {
    
	Scanner scn = new Scanner(System.in);
	
    System.out.println("Digite uma Base");
	int base = scn.nextInt();
	
    System.out.println("Digite um Expoente");
	int Expoente = scn.nextInt();

	System.out.println("A Potencia = "  + (Math.pow(base,Expoente)));
	
	}

}
