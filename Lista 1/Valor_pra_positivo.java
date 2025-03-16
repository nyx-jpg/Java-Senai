package Segunda_lista;

import java.util.Scanner;


public class transformando_um_valor_em_positivo {

	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);

		System.out.print("Insira um valor númerico: \n");
		int N = scn.nextInt();
		
		if (N<0) {
			
			System.out.print("\n"+N*(-1));
		}
		else {
			System.out.println("\n"+N);
		}
		scn.close();
		
	}

}
