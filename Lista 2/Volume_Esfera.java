import java.util.Scanner;

public class CalculoVolumeEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        
        double volume = (4.0 / 3) * 3.14159 * Math.pow(raio, 3);
        
 
        System.out.println("O volume da esfera é: " + volume);
        
        scanner.close();
    }
}
