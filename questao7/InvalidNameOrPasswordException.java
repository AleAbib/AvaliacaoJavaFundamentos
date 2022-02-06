package questao7;

//Exceção criada para tratar nomes com acento e espaço
public class InvalidNameOrPasswordException extends RuntimeException {
	
	public InvalidNameOrPasswordException(String msg) {
		super(msg);
	}
}
