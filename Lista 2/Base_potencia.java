import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        
        System.out.print("Digite a potência: ");
        int potencia = scanner.nextInt();
        

        int resultado = 1;
        for (int i = 0; i < potencia; i++) {
            resultado *= base;
        }

        System.out.println(base + "^" + potencia + " = " + resultado);
        
        scanner.close();
    }
}
