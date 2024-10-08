//Desenvolvido_por_Leticia_Verdelho_Ribeiro. data 19/09/2024
//Este codigo pede ao usuário digitar uma quantidade de Bits e o programa retorna a quantidade de Bytes e de Bits restantes,

import java.util.Scanner;

public class Bits_e_Bytes {

	public static void main(String[] args) {

		int Byte;

		Scanner scanner = new Scanner(System.in);

		// O usúario vai inserir a quantidade de Bits.
		System.out.print("Digite uma Quantidade de Bits: ");
		int Bits = scanner.nextInt();

		// Calculo para convertes Bits em Bytes, e calculo que mostra o restante da divisão, formula: (Bits % 8).
		int Bytes = Bits / 8;
		int bitsrestantes = Bits % 8;

		// Exibir o Resultado.
		System.out.println("A Quantidade de Bytes: " + Bytes);
		System.out.println("Os Bits restantes são: " + bitsrestantes);

		scanner.close();

	}

}
