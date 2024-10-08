//Desenvolvido_por_Leticia_Verdelho_Ribeiro.

import java.util.Scanner;

public class Exemploequals {

	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite Bom dia, Boa tarde ou Boa Noite: ");
		String saudacao = scanner.nextLine();
		
	
		if(saudacao.equalsIgnoreCase("bom dia")) {
			System.out.println("Bom Dia");
		}
		
		else if (saudacao.equalsIgnoreCase("Boa Tarde")){
			System.out.println("Boa Tarde");
		}
		
		else {
			System.out.println("Boa Noite");
		}

	}

}
