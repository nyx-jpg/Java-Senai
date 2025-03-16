package aula05;


import java.util.Scanner;

public class Prestacao {

	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	
	System.out.println("Digite o valor");
	double valor = scn.nextDouble();
	
	System.out.println("digite a taxa");
	double taxa = scn.nextDouble();
	
	System.out.println("digite tempo");
	double tempo = scn.nextDouble();	
	
	double prestacao=valor+(valor*(taxa/100)*tempo);
	
	System.out.println("prestacao = " + prestacao);

	
	}

}
