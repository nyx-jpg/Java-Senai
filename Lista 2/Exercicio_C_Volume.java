package Aula04;

import java.util.Scanner;

public class c_para_f {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite a Altura da lata de óleo:");
		double o_alt = scn.nextDouble();
		
		System.out.print("Digite o valor do Raio:");
		double val_ra = scn.nextDouble();
		
		double volume = 3.14159 * val_ra * val_ra * o_alt;
		
		
		System.out.print ("O volume da lata de Òleo=" + volume );

	}

}
