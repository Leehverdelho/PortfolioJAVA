//Desenvolvido por Leticia Verdelho Ribeiro - data - 30/09/2024
//Este codigo pede ao usuário pera ele digitar a sua idade se ele tiver mais de 18 anos de idade o programa retorna voce é maior de idade , senão o programa retorna voce é menor de idade.

//Exercicio 1

import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu Nome: ");//Usuario digita seu nome
		String nome = scanner.nextLine();
		
		System.out.print("Digite sua Idade: ");//Usuario digita a sua idade
		int idade = scanner.nextInt();
		
		if(idade >= 18) {
		    System.out.println( nome + " você é maior de idade!");
			
		}
		else if(idade >= 1 && idade < 18) {
			System.out.println( nome + " você é menor de idade!");
			
		}
		else if(idade == 0 ){
			System.out.println(nome + "Informação Invalida, Porfavor Digite a sua Idade!");
		}
		
		
		scanner.close();
		

	}

}
