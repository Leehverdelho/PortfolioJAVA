//Desenvolvido por Leticia verdelho Ribeiro - 25/09/2024

//Crie um program chamado teste de ansiedade onde o usuário responderá 10 perguntas especificas para o resultado final o usuário pode responder apenas "sim" ou "não" para cada pergunta.
//As perguntas espeficicas são:
//1. Voce se sente com dificuldade de concentração?
//2. Voce se sente cansado facilmente?
//3. Tem dificuldade em aodrmecer ou permanecer a dormir?
//4. Voce se preocupa muito com o futuro?
//5. Tem dificuldade em relaxar?
//6. Sentiu-se tão preocupado que foi dificil ficar parado?
//7. Sentiu-se facilmente irritável ou chateado?
//8. Sentiu medo como se algo muito ruim fosse acontecer?
//9. Você se preocupa com a opinião dos outros?
//10. Você está com dificuldades em lembrar os detalhes?
import java.util.Scanner;

public class Teste_de_Ansiedade {
	
	public static void main(String[] args) {
		
		int sim = 0;
		int nao = 0;
		int i = 0;
		
		
		String[] pergunta = {
				
				"1. Voce se sente com dificuldade de concentração?",
				
				"2. Voce se sente cansado facilmente?",
				
				"3. Tem dificuldade em acordar ou permanecer a dormir?",
				
				"4. Voce se preocupa muito com o futuro?",
				
				"5. Tem dificuldade em relaxar?",
				
				"6. Sentiu-se tão preocupado que foi dificil ficar parado?",
				
				"7. Sentiu-se facilmente irritável ou chateado?",
				
				"8. Sentiu medo como se algo muito ruim fosse acontecer?",
				
				"9. Você se preocupa com a opinião dos outros?",
				
				"10. Você está com dificuldades em lembrar os detalhes?",
			};
	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("===Olá seja bem vindo ao teste de Ansiedade!===");
		System.out.println("===Voce vai responder 10 perguntas apenas com 'sim' ou 'não'. ===");
		System.out.print("Digite seu Nome: ");
		String nome = scanner.nextLine();
		
		
		for( String perguntas : pergunta) {
			
			System.out.println(perguntas);
			String resposta = scanner.nextLine();
			if(resposta.equalsIgnoreCase("sim")){
				i++;
			}
			
		}
		
	
		System.out.println(i);
		
		if(i < 5 && i < 6) {
			System.out.println( nome + " você precisa cuidar do corpo e da mente, Precure Orientação Medica!");
		}
		else if(i <= 7) {
			System.out.println(nome + " você tem fortes indicios de Ansiedade, Faça Terapia!");
		}
		else {
		  System.out.println(nome + " você está aparentemente bem e sem risco de Ansiedade!");
		}
		
		scanner.close();
		
	}

}
