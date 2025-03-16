package Exercicios;

public class Fibonacci {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int proximo;

        System.out.println(anterior); 
        System.out.println(atual); 

        for (int i = 3; i <= 15; i++) { 
            proximo = anterior + atual;
            System.out.println(proximo);
            anterior = atual;
            atual = proximo;
        }
    }
}
