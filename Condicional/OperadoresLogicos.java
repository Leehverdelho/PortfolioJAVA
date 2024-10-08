//Desenvolvido_por_Leticia_Verdelho_Ribeiro.

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		// Declaração_de_Variáveis
		boolean condicao1 = true;
		boolean condicao2 = false;
		boolean condicao3 = true;
		
		// Operador_E_(&&)
		boolean resultadoE = condicao1 && condicao2; // False, pois_uma_das_condições_é_falsa
		System.out.println("Resultado do operador E (&&): " + resultadoE);
		
		// Operador_OU_(||)
		boolean resultadoOU = condicao1 || condicao2; // true, pois_uma_das_condições_é_verdadeira
		System.out.println("Resultado do operador OU (||): " + resultadoOU);
		
		// Operador_NAO_(!)
		boolean resultadoNAO = !condicao3; // False , pois_condicao3_é_true
		System.out.println("Resultado do operador NÃO (!): " + resultadoNAO);
		
		// COMBINADO OPERADORES 
		boolean resultadoCombinado =( condicao1 && condicao2) || (condicao2 && condicao3);
		System.out.println("Resultado da combinaçaõ de operadores:  " + resultadoCombinado);

	}

}
