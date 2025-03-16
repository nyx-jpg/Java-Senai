package Exercicios;

import java.util.Scanner;

public class Fatorial{


public static void main(String[] args) {

        int[] quadrados = new int[186];

        int index = 0;

        for (int i = 15; i <= 200; i++) {
        
            int quadrado = i * i;
        
            quadrados[index] = quadrado;
     
            index++;
        }

        System.out.println("Quadrados dos números inteiros de 15 a 200:");
        for (int square : quadrados) {
            System.out.println(square);
        }
    }
}