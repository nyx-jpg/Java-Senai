package exercicios;

import java.util.Scanner;

public class Exercicio_A {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String vetorNomes[]  = new String[10]; 
        int i = 0; 

        for(i = 0; i < 10 ; i++) {
            System.out.println("Informe um nome: ");
            vetorNomes[i] = scn.next();
        }
        for( i = 0 ; i < 10 ; i++) {
            System.out.println((i+1)+"º"+" nome: " + vetorNomes[i]);
        }
        scn.close();
    }
}
