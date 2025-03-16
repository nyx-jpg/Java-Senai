package Exercicios;

public class SomaPares {
    public static void main(String[] args) {
        int soma = 0;
        

        for (int i = 1; i <= 500; i++) {
            // Verifica se o número é par
            if (i % 2 == 0) {
                soma += i;
            }
        }
        
        System.out.println("O somatório dos valores pares de 1 a 500 é: " + soma);
    }
}
