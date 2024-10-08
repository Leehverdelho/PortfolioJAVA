//Desenvolvido_por_Leticia_Verdelho_Ribeiro. data 23/09/2024
//Este codigo pede ao usuário para digitar uma valor para N e um outro valor e no final ele mostra a divisão desses valores, se um dos numeros for 0 o programa vai exibir "Divisão Impossivel".


//Exercício 3

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		double valor = 0;

		Scanner scanner = new Scanner(System.in);
		
		        System.out.print("Digite um valor para N: ");
		        int num = scanner.nextInt();
		        
		        for (int i = 0; i < num; i++) {
		        	
		           System.out.print("Digite um Número: ");
		            x = scanner.nextInt();
		            y = scanner.nextInt();
		            
		            if (y == 0) {
		                System.out.println("Divisao impossivel");
		            }
		            else {
		                 valor = x / y ;
		                System.out.printf("%.2f\n", valor);
		            }
		        }
		        
		        scanner.close();
		    }
		}
