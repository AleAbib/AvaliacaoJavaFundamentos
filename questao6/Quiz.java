package questao6;

public class Quiz {
	
	//Criação de variáveis com perguntas e respostas esperadas, além de variáveis para armazenar nome, acertos e erros
	private int acertos;
	private int erros;
	private String nome;
	private String[] perguntas = {"De que país é a invenção do chuveiro elétrico?", "Qual o maior país do mundo?", "Qual o número mínimo de jogadores numa partida de futebol?"};
	private String[] respostas = {"brasil", "russia", "7"};
	
	//Função que retorna o array de perguntas
	public String[] getPerguntas() {
		return perguntas;
	}
	
	//Função que retorna o tamanho do array de perguntas
	public int getLenghtPerguntas() {
		return perguntas.length;
	}
	
	//Função que retorna o array de respostas
	public String[] getRespostas() {
		return respostas;
	}

	//Função que retorna um inteiro com o valor de erros
	public int getErros() {
		return erros;
	}
	
	//Função que incrementa +1 aos erros quando chamada
	public void setErros() {
		this.erros++;
	}
	
	//Função que retorna um inteiro com o valor de acertos
	public int getAcertos() {
		return acertos;
	}
	
	//Função que incrementa +1 aos acertos quando chamada
	public void setAcertos() {
		this.acertos++;
	}
	
	//Função que retorna o nome do usuário
	public String getNome() {
		return nome;
	}
	
	//Função que altera o nome do usuário
	public void setNome(String nome) {
		this.nome = nome;
	}
}
