import java.util.Scanner;

public class CalculoVolumeCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = scanner.nextDouble();
        
        System.out.print("Digite a largura da caixa: ");
        double largura = scanner.nextDouble();
        
        System.out.print("Digite a altura da caixa: ");
        double altura = scanner.nextDouble();
        
        double volume = comprimento * largura * altura;
        
        System.out.println("O volume da caixa é: " + volume);
        
        scanner.close();
    }
}
