//Desenvolvido_por_Leticia_Verdelho_Ribeiro. data 23/09/2024

//Exercício 4

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		
		// Ler o número inteiro N
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int N = scanner.nextInt();

		// Encontrar e imprimir os divisores de N
		
		System.out.println("Divisores de " + N + ":");
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}

		scanner.close();
	}
}