package aula_7;

import java.util.Scanner;


public class exercicio_r {

	public static void main(String[] args) {
		
	    float percentage;
		
	    float percentagecandA;

	    float percentagecandB;

	    float percentagecandC;

	    float percentagenulo;

	    float percentagebranco;

		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite Os Votos do candidato A:");
		int candA = scn.nextInt();
		
		System.out.print("Digite Os Votos do candidato B:");
		int candB = scn.nextInt();
		
		System.out.print("Digite Os Votos do candidato C:");
		int candC = scn.nextInt();
		
		System.out.print("Digite Os Votos Nulos:");
		int Nulo = scn.nextInt();
		
		System.out.print("Digite Os Votos Em Branco:");
		int Branco = scn.nextInt();

        int numerototal = candA + candB + candC + Nulo + Branco;
		
        int numerototalvalido = (candA + candB + candC );

        percentage = ((float) numerototalvalido * 100 / numerototal);

        percentagecandA = ((float) candA  * 100 / numerototal) ;

        percentagecandB = ((float) candB * 100 / numerototal) ;

        percentagecandC = ((float) candC * 100/ numerototal);

        percentagenulo = ((float) Nulo * 100 / numerototal);
        
        percentagebranco = ((float) Branco * 100 / numerototal);


		System.out.println("O Total de Votos foi:" + numerototal);
		
		System.out.println("A Porcentagem Total de Votos Válidos foi:" + numerototalvalido);

		System.out.println("A Porcentagem Total de Votos do canditado A em relação ao total foi:" + percentagecandA);

		System.out.println("A Porcentagem Total de Votos do canditado B em relação ao total foi:" + percentagecandB);
		
		System.out.println("A Porcentagem Total de Votos do canditado C em relação ao total foi:" + percentagecandC);

		System.out.println("A Porcentagem Total de Votos em branco com relação ao total foi:" + percentagenulo);
		
		System.out.println("A Porcentagem Total de Votos em Nulo com relação ao total foi:" + percentagebranco);

		
	}

}
