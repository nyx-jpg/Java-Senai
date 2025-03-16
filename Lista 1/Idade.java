package Segunda_lista;

import java.util.Scanner;


public class idade {

	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);
		
		System.out.println("Insira a sua idade:");
		int idade = scn.nextInt();
		
		if(idade >=18 && idade <=59) {
			System.out.println("Maior de Idade");
		}
		if(idade >=60 && idade <=110) {
			System.out.println("Idoso");
		}
		if(idade < 18 && idade > 13) {
			System.out.println("Menor de Idade");
		}
		if(idade <= 12) {
			System.out.println("Infância");
		}
		scn.close();
		
	}

}
