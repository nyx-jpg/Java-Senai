package segunda_lista;

import java.util.*;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Informe o primeiro valor: ");
		int N1 = scn.nextInt();

		System.out.println("Informe o segundo valor: ");
		int N2 = scn.nextInt();

		System.out.println("Informe o terceiro valor: ");
		int N3 = scn.nextInt();

		int[] numbers = { N1, N2, N3 };
		Arrays.sort(numbers);
		System.out.println("A ordem é: ");
		for (int num : numbers) {
			System.out.println(num);
		}

		scn.close();

	}

}