package Exercicios;


import java.util.Scanner;


public class FatorialImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        System.out.println("Digite 10 números:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

      
        for (int numero : numeros) {
            if (numero >= 1 && numero <= 10 && numero % 2 != 0) {
                long fatorial = calcularFatorial(numero);
                System.out.println("Fatorial de " + numero + ": " + fatorial);
            }
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}