import java.util.Scanner;

public class ConversaoDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite a quantidade de dólares disponível: ");
        double quantidadeDolares = scanner.nextDouble();
        double valorConversao = cotacaoDolar * quantidadeDolares;
        System.out.println("O valor da conversão em reais é: R$ " + valorConversao);
        
        scanner.close();
    }
}
