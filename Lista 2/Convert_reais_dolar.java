import java.util.Scanner;

public class ConversaoRealDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de reais disponível: R$ ");
        double quantidadeReais = scanner.nextDouble();
        

        double valorConversao = quantidadeReais / cotacaoDolar;

        System.out.println("O valor da conversão em dólares é: US$ " + valorConversao);
        
        scanner.close();
    }
}
