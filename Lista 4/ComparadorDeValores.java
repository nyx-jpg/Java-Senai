package exercicios;

import java.util.Scanner;

public class maior_e_menor__exerc_i {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o valor da primeira variável: ");
		int varA = scn.nextInt();
		
		System.out.print("Digite o valor da segunda variável: " );
		int varB = scn.nextInt();
		
		System.out.print("Digite o valor da terceira variável: ");
		int varC = scn.nextInt();
		
		System.out.print("Digite o valor da quarta variável: "  );
		int varD = scn.nextInt();
		
		System.out.print("Digite o valor da quinta variável: "  );
		int varE = scn.nextInt();
		

		if (varA > varB && varA > varC && varA > varD && varA > varE) {
			System.out.println("O maior valor é " + varA);
		}
		
		if (varB > varA && varB > varC && varB > varD && varB > varE) {
			System.out.println("O maior valor é " + varB);
		}
		
		if (varC > varA && varC > varB && varC > varD && varC > varE) {
			System.out.println("O maior valor é " + varC);
		}
		
		if (varD > varA && varD > varB && varD > varC && varD > varE) {
			System.out.println("O maior valor é " + varD);
		}
		
		if (varE > varA && varE > varB && varE > varC && varE > varD) {
			System.out.println("O maior valor é " + varE);
		}

		if (varA < varB && varA < varC && varA < varD && varA < varE) {
			System.out.println("O menor valor é " + varA);
		}
		
		if (varB < varA && varB < varC && varB < varD && varB < varE) {
			System.out.println("O menor valor é " + varB);
		}
		
		if (varC < varA && varC < varB && varC < varD && varC < varE) {
			System.out.println("O menor valor é " + varC);
		}
		
		if (varD < varA && varD < varB && varD < varC && varD < varE) {
			System.out.println("O menor valor é " + varD);
		}
		
		if (varE < varA && varE < varB && varE < varC && varE < varD) {
			System.out.println("O menor valor é " + varE);
		}
		scn.close();
		
		
		
		
		
		
		
	}

}
