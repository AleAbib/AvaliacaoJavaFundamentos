package questao7;

public class Usuario extends Hora {
	
	//Criando vari�veis est�ticas de usu�rios que possuem acesso ao sistema
	private String[] nome = {"andre", "marcos", "debora", "renan", "gionni"};
	private String[] senha = {"12345", "senha123", "123senha"};
	
	//Realiza busca pelo array de nome, de acordo com o nome inserido pelo usu�rio
	public void getNome(String nome) {
		
		//loop que percorre todo o array
		for(int i = 0; i < this.nome.length - 1;i++) {
			//compara��o entre o nome de entrada do usu�rio com os nomes do sistema
			if (nome.equals(this.nome[i])) {
				return;
			}
		}
		//Exce��o criada para quando o usu�rio estiver incorreto
		throw new InvalidNameOrPasswordException("Usu�rio ou senha incorretos!");
		
	}
	
	//Realiza busca pelo array de senha, de acordo com a senha inserida pelo usu�rio
	public void getSenha(String senha) {
		
		//loop que percorre todo o array
		for (int i = 0; i < this.senha.length - 1; i++) {
			//compara��o entre a senha de entrada do usu�rio com as senhas do sistema
			if(senha.equals(this.senha[i])) {	
				System.out.println("Acesso permitido!");
				return;
			}
		}
		//Exce��o criada para quando a senha estiver incorreta
		throw new InvalidNameOrPasswordException("Usu�rio e/ou senha incorretos.");
	}
}
