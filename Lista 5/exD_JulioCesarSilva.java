import java.util.Scanner;

public class EstatisticasNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 10;
        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }


        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;


        for (int i = 0; i < quantidade; i++) {
            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }


        double media = (double) soma / quantidade;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
