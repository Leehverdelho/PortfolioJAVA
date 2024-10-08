//Desenvolvido_por_Leticia_Verdelho_Ribeiro.
//Este codigo pede ao usuário 

//Exercicio-E.

import java.util.Scanner;

public class Funcionario {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o número do funcionário: ");
        int numero_funcionario = scanner.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		double horas_trabalhadas = scanner.nextDouble();
		
		System.out.print("Digite o valor que recebe por hora: ");
		double valor_hora = scanner.nextDouble();

			
		double salario = horas_trabalhadas * valor_hora ; 

		System.out.print("\nFuncionário número:" + numero_funcionario);
		
		System.out.printf("\nSalário: R$ %.2f" , salario);
		
		scanner.close();
	}

}
