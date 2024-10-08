//Desenvolvido_por_Leticia_Verdelho_Ribeiro. data 23/09/2024

//Exercício 5

import java.util.Scanner;

public class Exe_05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Lê o número N
		System.out.print("Digite um número inteiro positivo: ");
		int N = scanner.nextInt();

		// Verifica se o número é positivo
		if (N > 0) {
			for (int i = 1; i <= N; i++) {
				int quadrado = i * i;
				int cubo = i * i * i;
				System.out.println(i + " " + quadrado + " " + cubo);
			}
		} else {
			System.out.println("Por favor, insira um número inteiro positivo.");
		}

		scanner.close();
	}

}
