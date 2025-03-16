import java.util.Scanner;

public class ApuracaoEleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Digite a quantidade de votos válidos para o candidato A: ");
        int votosCandA = scanner.nextInt();
        
        System.out.print("Digite a quantidade de votos válidos para o candidato B: ");
        int votosCandB = scanner.nextInt();
        
        System.out.print("Digite a quantidade de votos válidos para o candidato C: ");
        int votosCandC = scanner.nextInt();
        

        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();
        
        System.out.print("Digite a quantidade de votos em branco: ");
        int votosEmBranco = scanner.nextInt();
        

        int totalEleitores = votosCandA + votosCandB + votosCandC + votosNulos + votosEmBranco;
        
        double porcentagemVotosValidos = ((double) (votosCandA + votosCandB + votosCandC) / totalEleitores) * 100;
        double porcentagemCandA = ((double) votosCandA / totalEleitores) * 100;
        double porcentagemCandB = ((double) votosCandB / totalEleitores) * 100;
        double porcentagemCandC = ((double) votosCandC / totalEleitores) * 100;
        double porcentagemNulos = ((double) votosNulos / totalEleitores) * 100;
        double porcentagemEmBranco = ((double) votosEmBranco / totalEleitores) * 100;
      
        System.out.println("Número total de eleitores: " + totalEleitores);
        System.out.println("Porcentagem de votos válidos em relação à quantidade de eleitores: " + porcentagemVotosValidos + "%");
        System.out.println("Porcentagem de votos válidos do candidato A em relação à quantidade de eleitores: " + porcentagemCandA + "%");
        System.out.println("Porcentagem de votos válidos do candidato B em relação à quantidade de eleitores: " + porcentagemCandB + "%");
        System.out.println("Porcentagem de votos válidos do candidato C em relação à quantidade de eleitores: " + porcentagemCandC + "%");
        System.out.println("Porcentagem de votos nulos em relação à quantidade de eleitores: " + porcentagemNulos + "%");
        System.out.println("Porcentagem de votos em branco em relação à quantidade de eleitores: " + porcentagemEmBranco + "%");
        
        scanner.close();
    }
}
