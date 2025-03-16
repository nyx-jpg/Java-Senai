package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;


public class list {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> numeros = new ArrayList<>();

	        for (int i = 0; i < 20; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            int numero = scanner.nextInt();
	            numeros.add(numero);
	        }

	        int pares = 0;
	        int impares = 0;
	        for (int numero : numeros) {
	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        System.out.println("Quantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);

	        scanner.close();
	    }
	}

