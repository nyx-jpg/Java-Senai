package exercicios;

import java.util.Scanner;

public class Exercicio_A {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        
        int i    = 0;
        int A [] = new int [12];
        int B [] = new int [12];

        
        System.out.println("Informe 12 valores para vetor A");
        for (i = 0 ; i < 12 ; i++) {
            System.out.println((i+1)+"º número: ");
            A[i] = scn.nextInt();   
        }
        for( i = 0 ; i < 12 ; i++) {
            if(A[i] % 2 == 1) {
                B[i] = A[i] * 2;
            }
            else {
                B[i] = A[i] * 3;
            }
            
        }
        System.out.println("\n\n");
        for (i = 0 ; i < 12 ; i++) {
            System.out.println((i+1)+"º \t"+B[i]);    
        }
        scn.close();
    }

}
