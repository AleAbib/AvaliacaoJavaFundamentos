package questao7;

public class Usuario extends Hora {
	
	//Criando variáveis estáticas de usuários que possuem acesso ao sistema
	private String[] nome = {"andre", "marcos", "debora", "renan", "gionni"};
	private String[] senha = {"12345", "senha123", "123senha"};
	
	//Realiza busca pelo array de nome, de acordo com o nome inserido pelo usuário
	public void getNome(String nome) {
		
		//loop que percorre todo o array
		for(int i = 0; i < this.nome.length - 1;i++) {
			//comparação entre o nome de entrada do usuário com os nomes do sistema
			if (nome.equals(this.nome[i])) {
				return;
			}
		}
		//Exceção criada para quando o usuário estiver incorreto
		throw new InvalidNameOrPasswordException("Usuário ou senha incorretos!");
		
	}
	
	//Realiza busca pelo array de senha, de acordo com a senha inserida pelo usuário
	public void getSenha(String senha) {
		
		//loop que percorre todo o array
		for (int i = 0; i < this.senha.length - 1; i++) {
			//comparação entre a senha de entrada do usuário com as senhas do sistema
			if(senha.equals(this.senha[i])) {	
				System.out.println("Acesso permitido!");
				return;
			}
		}
		//Exceção criada para quando a senha estiver incorreta
		throw new InvalidNameOrPasswordException("Usuário e/ou senha incorretos.");
	}
}
