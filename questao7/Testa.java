package questao7;

import java.util.Scanner;

public class Testa {
	
	public static void main(String[] args) {
		
		//cria��o de um usu�rio da classe Usuario
		Usuario user = new Usuario();
		
		//cria��o de uma variavel que far� leitura de dados
		Scanner leDados = new Scanner(System.in);
		
		//print para iniciar o sistema
		System.out.println("\n\nIniciando sistema!");
		
		//Prints que pedem ao usu�rio para inserirem usu�rio e senha e gravam em duas strings
		System.out.println("Usu�rio: ");
		String nome = leDados.nextLine();
		System.out.println("Senha: ");
		String senha = leDados.nextLine();
		
		//try catch que ir�o comparar o usu�rio e senha de entrada com os que possuem no sistema
		try {
			user.getNome(nome.toLowerCase());
			user.getSenha(senha);
			//print que far� a chamada da classe hora para dar a mensagem ao usu�rio caso ele se logue no sistema
			System.out.println(user.getTime());
		}catch (Exception excecao){
			//Caso ocorra algum erro de entrada o programa roda novamente para que possa serem inseridas novas entradas
			String msg = excecao.getMessage();
        	System.out.println(msg);
        	main(args);
		}
		
	}
}
