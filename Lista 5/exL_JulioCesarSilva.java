package Exercicios;

public class DivisiveisPorQuatro {
    public static void main(String[] args) {
        int contador = 0;

        System.out.println("Valores numéricos divisíveis por 4 e menores que 200:");
        

        while (contador < 200) {
            if (contador % 4 == 0) {
                System.out.println(contador); 
            }
            contador++; 
        }
    }
}
