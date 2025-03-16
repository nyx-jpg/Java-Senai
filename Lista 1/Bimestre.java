package Segunda_lista;

import java.util.Scanner;

public class media_bimestral {

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

		double MD1 = (n1 + n2 + n3 + n4) / 4;

		if (MD1 >= 7) {
			System.out.println("O aluno foi Aprovado! Com a média de: " + MD1);
		} else {
			System.out.println("Por favor, para tentar recuperar ");
			System.out.println("Insira a quinta nota: ");
			double NE = scn.nextDouble();
			double MD2 = (n1 + n2 + n3 + n4 + NE) / 5;
			if (MD2 >= 5) {
				System.out.println("O aluno foi aprovado, com a média: " + MD2);
			} else {
				System.out.println("O aluno foi Reprovado, com a média: " + MD2);
			}
		}
		scn.close();
	}

}
