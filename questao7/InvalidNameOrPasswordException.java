package questao7;

//Exce��o criada para tratar nomes com acento e espa�o
public class InvalidNameOrPasswordException extends RuntimeException {
	
	public InvalidNameOrPasswordException(String msg) {
		super(msg);
	}
}
