//Desenvolvido_por_Leticia_Verdelho_Ribeiro. data 23/09/2024

//Exercício 1 – Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, valor por linha, inclusive o X se for o caso.

import java.util.Scanner;

public class Exe_01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int X = scanner.nextInt();

		if (X >= 1 && X <= 1000) {

			for (int i = 1; i <= 1000; i++) {

				if (i % 2 != 0) {
					System.out.println("Os números impares são: " + i);
				}

			}
		} else {
			System.out.print("Número não está entre os números permitidos.");

			scanner.close();
		}
	}
}
