import java.util.Scanner;

public class CalculoVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Digite a distância percorrida em quilômetros: ");
        double distanciaKm = scanner.nextDouble();
        

        System.out.print("Digite o tempo decorrido em minutos: ");
        double tempoMinutos = scanner.nextDouble();
        

        double velocidade = (distanciaKm * 1000) / (tempoMinutos * 60);
        

        System.out.println("A velocidade do projétil é de " + velocidade + " metros por segundo.");
        
        scanner.close();
    }
}
