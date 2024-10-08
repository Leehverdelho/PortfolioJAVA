//Desenvolvido por Leticia Verdelho Ribeiro - data - 30/09/2024

//Professora eu esqueci como se usa o printf tentei colocar do jeito que anotei na minha folha e do jeito que lembro do caderno mais não foi, desculpa TwT.

//Exercicio 2
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		int par = 0;
		int impar = 0;
		
		for( int i = 0 ; i <= 50; i++) {
			
			if(i / 2 == 0) 
			{
				par++;
			}
			else {
				
				impar++;
			}
			
			System.out.println(" Os números pares são: " + par);
			System.out.println("\nOs números impares são: " + impar);
			
		}
		
		
	
	}

}
