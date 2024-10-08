//Desenvolvido_por_Leticia_Verdelho_Ribeiro.
//Este codigo pede ao usuário para digitar 2 valores e no final mostra a soma desses 2 numeros.

//Exercicio-A.

import java.util.Scanner;

public class Soma_numero_inteiro {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);

		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("Soma = " + soma );
		
		
		scanner.close();
		
		
	}

}
