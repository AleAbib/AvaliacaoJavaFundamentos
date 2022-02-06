package questao7;

import java.util.Scanner;

public class Testa {
	
	public static void main(String[] args) {
		
		//criação de um usuário da classe Usuario
		Usuario user = new Usuario();
		
		//criação de uma variavel que fará leitura de dados
		Scanner leDados = new Scanner(System.in);
		
		//print para iniciar o sistema
		System.out.println("\n\nIniciando sistema!");
		
		//Prints que pedem ao usuário para inserirem usuário e senha e gravam em duas strings
		System.out.println("Usuário: ");
		String nome = leDados.nextLine();
		System.out.println("Senha: ");
		String senha = leDados.nextLine();
		
		//try catch que irão comparar o usuário e senha de entrada com os que possuem no sistema
		try {
			user.getNome(nome.toLowerCase());
			user.getSenha(senha);
			//print que fará a chamada da classe hora para dar a mensagem ao usuário caso ele se logue no sistema
			System.out.println(user.getTime());
		}catch (Exception excecao){
			//Caso ocorra algum erro de entrada o programa roda novamente para que possa serem inseridas novas entradas
			String msg = excecao.getMessage();
        	System.out.println(msg);
        	main(args);
		}
		
	}
}
