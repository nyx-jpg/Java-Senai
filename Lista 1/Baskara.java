package Segunda_lista;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		System.out.println("Digite uma valor para A: ");
		double A = scn.nextDouble();

		System.out.println("Digite uma valor para B: ");
		double B = scn.nextDouble();

		System.out.println("Digite uma valor para C: ");
		double C = scn.nextDouble();


		double Delta = (Math.pow(B, 2)) - (4 * A * C);
		double Bhk1 = ((-B) + Math.sqrt(Delta)) / (2 * A);
		double Bhk2 = ((-B) - Math.sqrt(Delta)) / (2 * A);
		if (Delta == 0) {
			System.out.println("Delta possui apenas um valor real:" + Bhk1);
		} else if (Delta > 0) {
			System.out.println("Delta possui dois valores reais, as raizes são: " + Bhk1 + " e " + Bhk2);

		} else {
			System.out.println("Não há uma solução real");
		}
		scn.close();
	}

}
