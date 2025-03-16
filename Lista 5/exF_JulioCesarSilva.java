package Exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
	Scanner scn = new Scanner(System.in);
	
	String[] nomes = new String[3];
		
	Double[] medias = new Double[3];
	
	int aprovados = 0;
	
	int reprovados = 0;
	
	int recuperacao = 0;
	
	for (int i = 0; i < 3; i++) {
        System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
        nomes[i] = scn.nextLine();

        double somaNotas = 0;

        for (int j = 0; j < 4; j++) {
            double nota = -1;

            while (nota < 0 || nota > 10) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + " (entre 0 e 10): ");
                nota = scn.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida Por favor, digite uma nota entre 0 e 10");
                }
            }

            somaNotas += nota;
        }

        medias[i] = somaNotas / 4;
        scn.nextLine(); 

        if (medias[i] >= 7) {
            aprovados++;
        } else if (medias[i] <= 5) {
            reprovados++;
        } else {
            recuperacao++;
        }
    }

    scn.close();

    for (int i = 0; i < 3; i++) {
        String situacao;
        if (medias[i] >= 7) {
            situacao = "Aprovado";
        } else if (medias[i] <= 5) {
            situacao = "Reprovado";
        } else {
            situacao = "Recuperação";
        }
        System.out.printf("Aluno: %s - Média: %.2f - Situação: %s%n", nomes[i], medias[i], situacao);
    }

    System.out.println("\nNúmero de alunos aprovados: " + aprovados);
    System.out.println("Número de alunos em recuperação: " + recuperacao);
    System.out.println("Número de alunos em reprovado: " + reprovados);

	}
}
