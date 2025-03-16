package exercicios;

import java.util.Scanner;

public class Exercicio_B {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        
        int i    = 1;
        int A [] = new int [10];
        int num  = 0;

        
        System.out.println("Informe um número inteiro: ");
        num = scn.nextInt();

        
        for(i = 0 ; i < 10 ; i++) {
            A[i] = num*(i+1);
        }
        for(i = 0 ; i < 10 ; i++) {
            System.out.println(num + " x " + (i+1) + " = \t" +A[i]);
        }

        scn.close();
    }

}
