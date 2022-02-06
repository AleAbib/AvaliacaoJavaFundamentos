package questao6;

public class Quiz {
	
	//Cria��o de vari�veis com perguntas e respostas esperadas, al�m de vari�veis para armazenar nome, acertos e erros
	private int acertos;
	private int erros;
	private String nome;
	private String[] perguntas = {"De que pa�s � a inven��o do chuveiro el�trico?", "Qual o maior pa�s do mundo?", "Qual o n�mero m�nimo de jogadores numa partida de futebol?"};
	private String[] respostas = {"brasil", "russia", "7"};
	
	//Fun��o que retorna o array de perguntas
	public String[] getPerguntas() {
		return perguntas;
	}
	
	//Fun��o que retorna o tamanho do array de perguntas
	public int getLenghtPerguntas() {
		return perguntas.length;
	}
	
	//Fun��o que retorna o array de respostas
	public String[] getRespostas() {
		return respostas;
	}

	//Fun��o que retorna um inteiro com o valor de erros
	public int getErros() {
		return erros;
	}
	
	//Fun��o que incrementa +1 aos erros quando chamada
	public void setErros() {
		this.erros++;
	}
	
	//Fun��o que retorna um inteiro com o valor de acertos
	public int getAcertos() {
		return acertos;
	}
	
	//Fun��o que incrementa +1 aos acertos quando chamada
	public void setAcertos() {
		this.acertos++;
	}
	
	//Fun��o que retorna o nome do usu�rio
	public String getNome() {
		return nome;
	}
	
	//Fun��o que altera o nome do usu�rio
	public void setNome(String nome) {
		this.nome = nome;
	}
}
