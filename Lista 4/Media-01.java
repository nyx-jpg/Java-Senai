package aula10;

import java.util.Scanner;

public class media_bimestral_exec_c {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Cálculo da média das notas bimestrais \n \n");
		System.out.println("Informe a primeira nota: ");
		double n1 = scn.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double n2 = scn.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double n3 = scn.nextDouble();
		System.out.println("Informe a quarta nota: ");
		double n4 = scn.nextDouble();

		double MD = (n1 + n2 + n3 + n4) / 4;
		
		if (MD >= 5) {
			System.out.print("O aluno foi aprovado, obtendo a média de " + MD);
		}
		else {
			System.out.println("O aluno foi reprovado! Obtendo a média de " + MD);
		}
		scn.close();
		
	}

}
