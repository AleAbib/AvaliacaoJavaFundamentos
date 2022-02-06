package questao6;

import java.util.Scanner;

public class InteracaoUsuario {

	public static void main(String[] args) {
		
		//Variáveis criadas para armazenar dados
		String nome;
		String[] respostasDoUsuario = new String[5];
		
		//Criação de um Objeto da Classe Quiz para que seja criado o quiz
		Quiz game = new Quiz();
		
		//Variável para leitura de dados
		Scanner leDados = new Scanner(System.in);
		
		
		//Inicio do quiz
		System.out.println("\t Quiz de perguntas aleatórias");
		System.out.println("REGRAS: Todas as perguntas devem ser respondidas sem acentuação!");
		
		//Interação com o usuário para saber o nome
		System.out.println("Informe seu nome: ");
		nome = leDados.nextLine();
		
		
		//loop que faz o print das perguntas para que o usuário possa tentar acertar ou errar dada questão
		for(int i=0; i<game.getLenghtPerguntas();i++) {
			
			System.out.println(nome + ", " + game.getPerguntas()[i]);
			respostasDoUsuario[i] = leDados.nextLine();
			
			
			//Condicionais que printam ao usuário o estado da questão respondida e incrementa o erro ou acerto
			if(game.getRespostas()[i].equals(respostasDoUsuario[i].toLowerCase())) {
				System.out.println("Você acertou! \n");
				game.setAcertos();
			}else {
				System.out.println("Você errou! \n");
				game.setErros();
			}
		}
		
		//Prints que retornam ao usuário o resultado do jogador
		System.out.println("\t Resultado \n");
		
		System.out.println("Jogador: " + nome);
		System.out.println("Acertos: " + game.getAcertos());
		System.out.println("Erros: " + game.getErros() + "\n");	
		
		
		//Prints que indica o  gabarito da questão
		System.out.println("\t Gabarito \n");
		
		
		//loop que percorre o array de respostas esperadas e printando para que os usuários saibam quais eram as respostas esperadas.
		for (int i=0; i<game.getLenghtPerguntas();i++) {
			
			System.out.println("\t Pergunta" + (i+1));
			System.out.println("Resposta dada: " + respostasDoUsuario[i]);
			System.out.println("Resposta esperada: " + game.getRespostas()[i]);
		}
	}

}
