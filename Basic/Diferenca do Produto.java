//Desenvolvido_por_Leticia_Verdelho_Ribeiro.
//Este codigo pede ao usu�rio para digitar 4 valores e no final retorna a diferen�a desses valores.//

//Exercicio-C.

import java.util.Scanner;

public class Diferenca_do_Produto {
	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um valor inteiro para A: ");
		int A = scanner.nextInt();
		
		System.out.print("Digite um valor inteiro para B: ");
		int B = scanner.nextInt();
		
		System.out.print("Digite um valor inteiro para C: ");
		int C = scanner.nextInt();
		
		System.out.print("Digite um valor inteiro para D: ");
		int D = scanner.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.print("Diferença = " + diferenca);
		
		scanner.close();
		
		
	}
}
