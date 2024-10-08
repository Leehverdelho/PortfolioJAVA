//Desenvolvido_por_Leticia_Verdelho_Ribeiro.

//Exercicio-B.

import java.util.Scanner;

public class Raio_do_Circulo {

	public static void main(String[] args) {
	

		Scanner scanner = new Scanner (System.in);

		System.out.print("Digite o valor do raio do Circulo: ");
		double raio = scanner.nextDouble();
		
		double Pi = 3.14159;
		
		double area = Pi * raio*raio;
		
		System.out.printf(" Area = %.4f" , area);
		
		scanner.close();
		
	}
}
