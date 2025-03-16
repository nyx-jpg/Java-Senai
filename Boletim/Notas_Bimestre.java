package aula_7;

import java.util.Scanner;


public class Notas_Bimestre {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o Diciplina do Aluno");
        String Diciplina = scn.nextLine();
        
        System.out.println("Digite a Turma do Aluno");
        String Turma = scn.nextLine();
        
        System.out.println("Digite o Nome do Aluno");
        String Nome = scn.nextLine();

        System.out.println("Digite a 1ª nota do Aluno");
        float nota_1 = scn.nextFloat();

        System.out.println("Digite a 2ª nota do Aluno");
        float nota_2 = scn.nextFloat();

        System.out.println("Digite a 3ª nota do Aluno");
        float nota_3 = scn.nextFloat();

        System.out.println("Digite a 4ª nota do Aluno");
        float nota_4 = scn.nextFloat();

        float media = (nota_1 + nota_2 + nota_3 + nota_4) / 4;

        System.out.println("O Aluno " + Nome + "  Tem as notas que são: " + nota_1 + ", " + nota_2 + ", " + nota_3 + ", " + nota_4);
        
        System.out.println("Média da Máteria : " + Diciplina +  " , " + media + ", Da turma " + Turma);

        if (media < 7) {
            System.out.println(Nome + " Reprovado");
        } else {
            System.out.println(Nome + " Aprovado");
        }

    }
}