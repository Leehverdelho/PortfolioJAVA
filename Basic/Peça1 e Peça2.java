//Desenvolvido_por_Leticia_Verdelho_Ribeiro.
//Este codigo pede ao usuario para que digite o codigo de uma peça, a quantidade e o valor unitario das peças e no final o programa mostra o valor a pagar.

//Exercicio-D.

import java.util.Scanner;

public class Peça1_e_Peça2 {
			
    public static void main(String[] args) {
    	
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Digite o código da Peça1: ");
      double peca1 = scanner.nextDouble();
      
      System.out.print("\nDigite a quantidade da Peça1 que estão sendo levadas: ");
      double quantidade1 = scanner.nextDouble();
      
      System.out.print("\nDigite o valor unitario da Peça1: ");
      double valor_unitario1 = scanner.nextDouble();
      
      System.out.print("\nDigite o código da Peça2: ");
      double peca2 = scanner.nextDouble();
      
      System.out.print("Digite a quantidade da Peça2 que estão sendo levadas: ");
      double quantidade2 = scanner.nextDouble();
      
      System.out.print("\nDigite o valor unitario da Peça2: ");
      double valor_unitario2 = scanner.nextDouble();
      
      double valor1 = valor_unitario1 * quantidade1;
      double valor2 = valor_unitario2 * quantidade2;
      double valor_pagar = valor1 + valor2;
      
      System.out.print("\nValor a pagar: R$" + valor_pagar);
      
      scanner.close();		
   }
}
