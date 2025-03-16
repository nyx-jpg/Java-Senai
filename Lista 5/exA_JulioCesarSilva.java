import java.util.Scanner;

public class PotenciasDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int base = 3;
        for (int expoente = 0; expoente <= numero; expoente++) {
            int resultado = (int) Math.pow(base, expoente);
            System.out.println(resultado);
        }

        scanner.close();
    }
}
