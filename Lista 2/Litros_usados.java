package aula05;

import java.util.Scanner;

public class litros_usados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o tempo da viagem:");
		double tempo = scn.nextDouble();
		
		System.out.println("Digite a velocidade média:");
		double velocidade = scn.nextDouble();
		
		double distancia = tempo * velocidade;
		double litros = distancia / 12;
		
		System.out.println("Tempo = " + tempo);
		System.out.println("velocidade = " + velocidade);
		System.out.println("Distancia = " + distancia);
		System.out.println("Litros de combustivel: " + litros);
		
	}
	

}
