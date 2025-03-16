import java.util.Scanner;

public class QuadradoSemArmazenamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número");
        int valor = scanner.nextInt();
        
        System.out.println("O quadrado do valor digitado é: " + Math.pow(valor, 2));
        
        scanner.close();
    }
}
